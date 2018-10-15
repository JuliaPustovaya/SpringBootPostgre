package com.appliaction.service;

import java.util.Collections;
import java.util.List;

import javax.validation.ConstraintViolationException;

import com.appliaction.bean.MatcgerParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appliaction.bean.Contact;
import com.appliaction.bean.ContactNotFindEcxeption;
import com.appliaction.repository.ContactRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.NoHandlerFoundException;

@Service
public class ContactService implements IContactService {
    @Autowired
    private ContactRepository repository;

    @Override
    public List<Contact> findAll(String nameFilter) {
        List<Contact> contacts = (List<Contact>) repository.findAll();
        for (int i = 0; i <contacts.size() ; i++) {
            MatcgerParser.getRegulars(nameFilter,contacts.get(i).getName());
        }
        if (contacts.isEmpty()) throw new ContactNotFindEcxeption("No contacts");
        return contacts;
    }


}

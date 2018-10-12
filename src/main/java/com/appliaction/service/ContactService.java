package com.appliaction.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appliaction.bean.Contact;
import com.appliaction.bean.ContactNotFindEcxeption;
import com.appliaction.repository.ContactRepository;

@Service
public class ContactService implements IContactService {
	@Autowired
	private ContactRepository repository;

	@Override
	public List<Contact> findAll() {
		List<Contact> contacts=(List<Contact>)repository.findAll();
		if(contacts.isEmpty()) throw new ContactNotFindEcxeption("No contacts");
		return contacts;
	}
}

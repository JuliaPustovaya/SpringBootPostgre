package com.appliaction.service;

import java.util.List;

import com.appliaction.bean.Contact;
import org.springframework.web.servlet.NoHandlerFoundException;

public interface IContactService {

	public List<Contact> findAll(String nameFilter);
}

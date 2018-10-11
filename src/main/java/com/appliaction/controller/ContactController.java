package com.appliaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.appliaction.bean.Contact;
import com.appliaction.service.IContactService;

@Controller
public class ContactController {
	@Autowired
	IContactService contactService;

	@RequestMapping("/contacts")
	public String getContacts (@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
		List<Contact> contacts = (List<Contact>) contactService.findAll();
		model.addAttribute("contacts", contacts);
		return "getContacts";

	}
}

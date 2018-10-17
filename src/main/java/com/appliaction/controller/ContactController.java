package com.appliaction.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;

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
	private static final String VALIDATION_REGEX = "[^<>\"]+$";


	@RequestMapping("/contacts")
	public String getContacts(@Valid @Pattern(regexp = VALIDATION_REGEX) @RequestParam(value = "nameFilter") String nameFilter, Model model) {
		//	String par = URLEncoder.encode(nameFilter,"UTF-8");
		List<Contact> contacts = (List<Contact>) contactService.findAll(nameFilter);
		model.addAttribute("contacts", contacts);
		model.addAttribute("nameFilter", nameFilter);
		return "getContacts";
	}
}


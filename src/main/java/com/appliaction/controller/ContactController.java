package com.appliaction.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

import javax.validation.Valid;

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
	public String getContacts( @RequestParam(value = "nameFilter") String nameFilter, Model model) throws UnsupportedEncodingException {
		String par = URLDecoder.decode(nameFilter, StandardCharsets.UTF_8.toString());
		List<Contact> contacts = (List<Contact>) contactService.findAll(URLDecoder.decode(nameFilter, "UTF-8"));
		model.addAttribute("contacts", contacts);
		model.addAttribute("nameFilter", nameFilter);
		return "getContacts";
	}
}

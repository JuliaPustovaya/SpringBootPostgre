package com.appliaction.bean;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ContactNotFindEcxeption extends RuntimeException {

	public ContactNotFindEcxeption(String exception) {
		super(exception);
	}
}

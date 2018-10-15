package com.appliaction.bean;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class RegexEcxeption extends RuntimeException {

	public RegexEcxeption(String exception) {
		super(exception);
	}
}
//	public boolean isRegex(final String str) {
//		try {
//			java.util.regex.Pattern.compile(str);
//			return true;
//		} catch (java.util.regex.PatternSyntaxException e) {
//			return false;
//		}
//	}
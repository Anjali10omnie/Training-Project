package com.user.management.Handling;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserNotFoundException {
	
	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<String>handleIntegrityEcxeption()
	{
		String msg="Data Already present";
		return new ResponseEntity<>(msg,HttpStatus.BAD_REQUEST);
	}

}

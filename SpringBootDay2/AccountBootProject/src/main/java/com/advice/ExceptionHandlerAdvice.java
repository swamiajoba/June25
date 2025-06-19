package com.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.exception.RecordNotFoundException;

@RestControllerAdvice
public class ExceptionHandlerAdvice {
	
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	@ExceptionHandler(RecordNotFoundException.class)
	public String handleException1(RecordNotFoundException e) {
		return e.getMessage();
	}
	
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(IllegalArgumentException.class)
	public String handleException2(IllegalArgumentException e) {
		return e.getMessage();
	}
	
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(Exception.class)
	public String handleException3(Exception e) {
		return e.getMessage();
	}

}

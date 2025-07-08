package com.advice;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.validation.ObjectError;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.exception.AccountNotFoundException;

//@ControllerAdvice
@RestControllerAdvice   // Global exception handling
public class AccountNotFoundAdvice 
{
	
	  @ExceptionHandler(AccountNotFoundException.class)
	  @ResponseStatus(HttpStatus.NOT_FOUND)
	  String accountNotFoundHandler(AccountNotFoundException ex) {
	    return ex.getMessage();
	  }
	
}

/*
 * 
 * 
 * Spring 3.2 brings support for a global @ExceptionHandler with the @ControllerAdvice annotation.

This enables a mechanism that breaks away from the older MVC model and makes use of ResponseEntity along with the type safety and flexibility of @ExceptionHandler:
 * @ResponseBody signals that this advice is rendered straight into the response body.

@ExceptionHandler configures the advice to only respond if an EmployeeNotFoundException is thrown.

@ResponseStatus says to issue an HttpStatus.NOT_FOUND, i.e. an HTTP 404.

The body of the advice generates the content. In this case, it gives the message of the exception.
*/

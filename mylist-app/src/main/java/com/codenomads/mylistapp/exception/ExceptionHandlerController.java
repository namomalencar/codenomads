package com.codenomads.mylistapp.exception;


import java.util.stream.Collectors;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerController {

	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<?> validateError(ConstraintViolationException ex) {
		ErroResponse err = new ErroResponse(HttpStatus.BAD_REQUEST
											,ex.getMessage()
											,ex.getConstraintViolations().stream()
																		 .map(cv -> cv.getMessage())
																		 .collect(Collectors.toList()));
		return ResponseEntity.badRequest().body(err);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> otherErrors(Exception ex) {
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
	}


}

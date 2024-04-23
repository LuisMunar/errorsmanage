package com.errorsmanage.errorsmanage.controllers;

import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.http.HttpStatus;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.errorsmanage.errorsmanage.exceptions.UserNotFoundException;
import com.errorsmanage.errorsmanage.models.Error;

@RestControllerAdvice
public class HandlerException {

  @ExceptionHandler({ ArithmeticException.class })
  public ResponseEntity<Error> divisionByZero(Exception e) {
    Error error = new Error("Arithmetic", "Division by zero is not allowed", new Date());
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
  }

  @ExceptionHandler({ NoHandlerFoundException.class })
  public ResponseEntity<Error> notFound(Exception e) {
    Error error = new Error("Not Found", e.getMessage(), new Date());
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
  }

  @ExceptionHandler({ NumberFormatException.class })
  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  public Map<String, String> numberFormatException(Exception e) {
    Map<String, String> error = new HashMap<>();
    error.put("error", "Number Format Exception");
    error.put("message", e.getMessage());
    return error;
  }

  @ExceptionHandler({ NullPointerException.class, HttpMessageNotWritableException.class, UserNotFoundException.class })
  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  public Map<String, String> userException(Exception e) {
    Map<String, String> error = new HashMap<>();
    error.put("error", "User not found");
    error.put("message", e.getMessage());
    return error;
  }
}

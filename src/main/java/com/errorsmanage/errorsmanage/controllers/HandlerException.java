package com.errorsmanage.errorsmanage.controllers;

import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.ResponseEntity;
import java.util.Date;
import org.springframework.http.HttpStatus;

import com.errorsmanage.errorsmanage.models.Error;

@RestControllerAdvice
public class HandlerException {

  @ExceptionHandler({ ArithmeticException.class })
  public ResponseEntity<?> divisionByZero(Exception e) {
    Error error = new Error("Arithmetic", "Division by zero is not allowed", new Date());
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
  }
}

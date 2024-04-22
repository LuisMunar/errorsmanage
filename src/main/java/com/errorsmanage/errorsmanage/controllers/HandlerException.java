package com.errorsmanage.errorsmanage.controllers;

import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.ResponseEntity;

@RestControllerAdvice
public class HandlerException {

  @ExceptionHandler({ ArithmeticException.class })
  public ResponseEntity<?> divisionByZero(Exception e) {
    return ResponseEntity.status(500).body("Division by zero is not allowed");
  }
}

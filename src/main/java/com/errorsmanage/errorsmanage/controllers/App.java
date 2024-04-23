package com.errorsmanage.errorsmanage.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/app")
public class App {
  @GetMapping("")
  public ResponseEntity<Integer> index() {
    // int value = 1 / 0;
    // return ResponseEntity.status(HttpStatus.OK).body(value);

    int value = Integer.parseInt("10x");
    return ResponseEntity.status(HttpStatus.OK).body(value);
    
    // try {
    //   int value = 1 / 0;
    //   return ResponseEntity.status(HttpStatus.ACCEPTED).body(value);
    // } catch (Exception e) {
    //   return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e);
    // }
  }
}

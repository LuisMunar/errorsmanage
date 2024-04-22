package com.errorsmanage.errorsmanage.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/app")
public class App {
  @GetMapping("")
  public String index() {
    // int value = 1 / 0;
    // return "Greetings from Spring Boot!";
    try {
      throw new Exception("This is an exception");
    } catch (Exception e) {
      return e.getMessage();
    }
  }
}

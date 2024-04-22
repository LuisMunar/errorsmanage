package com.errorsmanage.errorsmanage.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/app")
public class App {
  @GetMapping("")
  public String index() {
    return "Greetings from Spring Boot!";
  }
}

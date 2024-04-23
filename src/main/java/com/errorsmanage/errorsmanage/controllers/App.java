package com.errorsmanage.errorsmanage.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

import com.errorsmanage.errorsmanage.exceptions.UserNotFoundException;
import com.errorsmanage.errorsmanage.models.User;
import com.errorsmanage.errorsmanage.services.UserService;


@RestController
@RequestMapping("/app")
public class App {

  @Autowired
  private UserService userService;

  @GetMapping("")
  public ResponseEntity<Integer> index() {
    // int value = 1 / 0;
    // return ResponseEntity.status(HttpStatus.OK).body(value);

    int value = Integer.parseInt("10x");
    return ResponseEntity.status(HttpStatus.OK).body(value);
  }

  @GetMapping("/users")
  public ResponseEntity<List<User>> users() {
    List<User> users = userService.getUsers();
    return users.isEmpty() ? ResponseEntity.status(HttpStatus.NO_CONTENT).body(null) : ResponseEntity.status(HttpStatus.OK).body(users);
  }

  @GetMapping("/users/{id}")
  public ResponseEntity<User> user(@PathVariable(name = "id") int id) {
    User user = userService.getUser(id).orElseThrow(() -> new UserNotFoundException("User not found custom message"));

    // if (user == null) {
    //   throw new UserNotFoundException("User not found custom message");
    // }

    user.getName();
    return user == null ? ResponseEntity.status(HttpStatus.NO_CONTENT).body(null) : ResponseEntity.status(HttpStatus.OK).body(user);
  }
}

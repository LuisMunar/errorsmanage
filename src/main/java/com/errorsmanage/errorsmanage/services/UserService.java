package com.errorsmanage.errorsmanage.services;

import org.springframework.stereotype.Service;
import java.util.List;

import com.errorsmanage.errorsmanage.models.User;

@Service
public class UserService implements UserInterface {
  private List<User> users;

  public UserService() {
    users = List.of(
      new User(1, "John", "Doe"),
      new User(2, "Jane", "Doe"),
      new User(3, "Alice", "Doe"),
      new User(4, "Bob", "Doe")
    );
  }

  @Override
  public List<User> getUsers() {
    return users;
  }

  @Override
  public User getUser(int id) {
    return users.stream().filter(user -> user.getId() == id).findFirst().orElse(null);
  }
}

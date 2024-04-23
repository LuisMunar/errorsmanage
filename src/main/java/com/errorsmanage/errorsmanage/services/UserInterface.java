package com.errorsmanage.errorsmanage.services;

import java.util.List;
import java.util.Optional;

import com.errorsmanage.errorsmanage.models.User;

public interface UserInterface {
  List<User> getUsers();
  Optional<User> getUser(int id);
}

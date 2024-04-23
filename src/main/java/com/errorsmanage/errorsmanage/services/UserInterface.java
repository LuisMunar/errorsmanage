package com.errorsmanage.errorsmanage.services;

import java.util.List;

import com.errorsmanage.errorsmanage.models.User;

public interface UserInterface {
  List<User> getUsers();
  User getUser(int id);
}

package de.telran.tinder.service;

import de.telran.tinder.User;

import java.util.List;

public interface UserService {
    User getNewUser();
    List<User> getAllUsers();

    User getShortNameUser();

}

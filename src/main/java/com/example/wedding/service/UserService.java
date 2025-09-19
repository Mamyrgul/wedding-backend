package com.example.wedding.service;

import com.example.wedding.dto.UserRequest;
import com.example.wedding.enity.User;

import java.util.List;

public interface UserService {
    User registerGuest(UserRequest request);
    List<User> getAllGuests();
}

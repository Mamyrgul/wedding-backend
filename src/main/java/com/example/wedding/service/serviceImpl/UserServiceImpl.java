package com.example.wedding.service.serviceImpl;

import com.example.wedding.enity.User;
import com.example.wedding.enums.Role;
import com.example.wedding.repo.UserRepository;
import com.example.wedding.service.UserService;
import com.example.wedding.dto.UserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public User registerGuest(UserRequest request) {
        User guest = User.builder()
                .fullName(request.fullName())
                .relatives(request.relatives())
                .isCome(request.isCome())
                .guestCount(request.guestCount())
                .role(Role.USER)
                .build();
        return userRepository.save(guest);
    }

    @Override
    public List<User> getAllGuests() {
        return userRepository.findAll();
    }
}


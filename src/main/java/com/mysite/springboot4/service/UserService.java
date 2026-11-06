package com.mysite.springboot4.service;

import com.mysite.springboot4.domain.User;
import com.mysite.springboot4.dto.AddUserRequest;
import com.mysite.springboot4.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public Long save(AddUserRequest dto) {
        return userRepository.save(User.builder().email(dto.getEmail()).password(passwordEncoder.encode(dto.getPassword())).build()).getId();
    }
}

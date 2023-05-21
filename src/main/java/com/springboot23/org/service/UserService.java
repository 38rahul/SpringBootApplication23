package com.springboot23.org.service;

import com.springboot23.org.dto.UserDto;
import com.springboot23.org.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();

}

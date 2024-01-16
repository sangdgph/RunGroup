package com.rungroup.springMVC.service;

import com.rungroup.springMVC.dto.RegistrationDto;
import com.rungroup.springMVC.models.UserEntity;

public interface UserService {
    void saveUser(RegistrationDto registrationDto);

    UserEntity findByEmail(String email);

    UserEntity findByUsername(String username);
}

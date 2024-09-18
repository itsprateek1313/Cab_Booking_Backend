package com.project.uber.UberApp.services;

import com.project.uber.UberApp.dto.DriverDto;
import com.project.uber.UberApp.dto.SignupDto;
import com.project.uber.UberApp.dto.UserDto;

public interface AuthService {

    String login(String username, String password);
    UserDto signup(SignupDto signupDto);
    DriverDto onboardNewDriver(Long userID);

}

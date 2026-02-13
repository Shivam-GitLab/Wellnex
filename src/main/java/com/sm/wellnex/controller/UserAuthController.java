package com.sm.wellnex.controller;

import com.sm.wellnex.dto.RegisterRequest;
import com.sm.wellnex.dto.RegisterResponse;
import com.sm.wellnex.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserAuthController {
    private final UserService userService;

    @PostMapping("/register")
    public RegisterResponse register(@RequestBody RegisterRequest registerRequest) {
        return userService.register(registerRequest);
    }
    /*@PostMapping("/login")
    public String login(@RequestBody RegisterRequest registerUserRequest) {
        return "Login successful for user: " + registerUserRequest.getEmail();
    }*/

}

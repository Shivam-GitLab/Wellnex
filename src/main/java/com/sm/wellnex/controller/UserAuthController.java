package com.sm.wellnex.controller;

import com.sm.wellnex.dto.RegisterRequest;
import com.sm.wellnex.dto.RegisterResponse;
import com.sm.wellnex.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<RegisterResponse> register(@RequestBody RegisterRequest registerRequest) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(userService.register(registerRequest));

    }

//        return ResponseEntity.ok(userService.register(registerRequest));
//        return new ResponseEntity<>(userService.register(registerRequest),HttpStatus.CREATED);

    @PostMapping("/login")
    public String login(@RequestBody RegisterRequest registerUserRequest) {
        return "Login successful for user: " + registerUserRequest.getEmail();
    }

}



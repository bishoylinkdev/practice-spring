package com.example.practicespring.controllers;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HomeController {

    @Getter
    @Setter
    private static class LoginDto {
        private String username;
        private String password;
    }

    @PostMapping("/login")
    public void homeEndpoint(@RequestBody LoginDto loginDto) {
        log.info("login username : {}", loginDto.getUsername());
        log.info("login password : {}", loginDto.getPassword());
    }
}

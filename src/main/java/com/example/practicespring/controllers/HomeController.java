package com.example.practicespring.controllers;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@Slf4j
public class HomeController {

    @Getter
    @Setter
    private static class LoginDto {
        private String username;
        private String password;
    }

    @GetMapping("/")
    public ModelAndView homeEndpoint() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message", "Spring Boot Application");
        return modelAndView;
    }

    @PostMapping("/login")
    public void loginEndpoint(@RequestBody LoginDto loginDto) {
        log.info("login username : {}", loginDto.getUsername());
        log.info("login password : {}", loginDto.getPassword());
    }
}

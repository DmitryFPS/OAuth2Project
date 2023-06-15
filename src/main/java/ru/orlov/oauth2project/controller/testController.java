package ru.orlov.oauth2project.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/test")
public class testController {
    @GetMapping("/login")
    public String work() {
        return "login";
    }

    @GetMapping("/internal")
    public String internal() {
        return "internal";
    }
}
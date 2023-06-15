package ru.orlov.oauth2project.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    @GetMapping("/get")
    @PreAuthorize("hasRole('user') || hasRole('admin')")
    public String get() {
        return "Доступен всем пользователям у которых есть роль \"User\"";
    }

    @PostMapping("/post")
    @PreAuthorize("hasRole('admin')")
    public String post() {
        return "Доступен всем пользователям у которых есть роль \"Admin\"";
    }
}
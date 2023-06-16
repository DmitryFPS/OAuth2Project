package ru.orlov.oauth2project.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/test")
public class TestController {
    @GetMapping("/login")
    public String work() {
        return "login";
    }

    @GetMapping("/get")
    @PreAuthorize("hasRole('user') || hasRole('admin')")
    public String get(@AuthenticationPrincipal final Jwt jwt) {
        final String name = jwt.getClaim("name");
        return "Доступен всем пользователям у которых есть роль \"User\", сам Юзер == " + name;
    }

    @PostMapping("/post")
    @PreAuthorize("hasRole('admin')")
    public String post() {
        return "Доступен всем пользователям у которых есть роль \"Admin\"";
    }
}
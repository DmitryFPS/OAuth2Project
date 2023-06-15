package ru.orlov.oauth2project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class OAuth2ProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(OAuth2ProjectApplication.class, args);
    }
}

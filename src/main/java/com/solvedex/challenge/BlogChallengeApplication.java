package com.solvedex.challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class}
)
public class BlogChallengeApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogChallengeApplication.class, args);
    }

}

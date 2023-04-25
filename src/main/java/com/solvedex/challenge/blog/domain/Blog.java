package com.solvedex.challenge.blog.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Blog {

    private Long id;
    private String content;
    private String author;
    private LocalDate date;
}

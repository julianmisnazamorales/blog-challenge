package com.solvedex.challenge.blog.infrastructure.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class BlogRequest {
    private String id;
    private String content;
}

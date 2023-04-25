package com.solvedex.challenge.blog.application;

import lombok.Getter;

import java.util.HashMap;
import java.util.List;

@Getter
public final class SearchBlogByCriteria {

    private final List<HashMap<String, String>> filters;

    public SearchBlogByCriteria(List<HashMap<String, String>> filters){
        this.filters = filters;
    }
}

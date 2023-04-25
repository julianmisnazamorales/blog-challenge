package com.solvedex.challenge.blog.application.create;

import com.solvedex.challenge.blog.domain.Blog;
import com.solvedex.challenge.blog.infrastructure.BlogRepository;
import org.springframework.stereotype.Service;

@Service
public class BlogCreator {

    private final BlogRepository repository;

    public BlogCreator(BlogRepository repository){
        this.repository = repository;
    }

    public void create(Blog blog){
        repository.save(blog);
    }
}

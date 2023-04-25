package com.solvedex.challenge.blog.infrastructure;

import com.solvedex.challenge.blog.domain.Blog;

import java.util.Optional;

public interface BlogRepository{
    void save(Blog blog);

    Optional<Blog> search(Long id);
}

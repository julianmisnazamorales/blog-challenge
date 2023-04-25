package com.solvedex.challenge.blog.infrastructure;

import com.solvedex.challenge.blog.domain.Blog;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class MySqlBlogRepository implements BlogRepository{
    @Override
    public void save(Blog blog) {

    }

    @Override
    public Optional<Blog> search(Long id) {
        return Optional.empty();
    }
}

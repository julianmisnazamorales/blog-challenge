package com.solvedex.challenge.blog.infrastructure;

import com.solvedex.challenge.blog.domain.Blog;

import java.util.HashMap;
import java.util.Optional;

public final class InMemoryBlogRepository {

    private HashMap<Long, Blog> blogs = new HashMap();

    public void save(Blog blog){blogs.put(blog.getId(), blog);}

    public Optional<Blog> search(Long id){ return Optional.ofNullable(blogs.get(id)); }
}

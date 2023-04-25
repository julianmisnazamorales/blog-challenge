package com.solvedex.challenge.blog.infrastructure;

import com.solvedex.challenge.blog.BlogContextInfrastructureTestCase;

public class BlogModuleInfrastructureTestCase extends BlogContextInfrastructureTestCase {

    protected InMemoryBlogRepository inMemoryBlogRepository = new InMemoryBlogRepository();
}

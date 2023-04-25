package com.solvedex.challenge.blog.infrastructure;

import com.solvedex.challenge.blog.BlogChallengeApplicationTests;
import org.junit.jupiter.api.Test;

public class BlogPutControllerTest extends BlogChallengeApplicationTests {

    @Test
    void create_a_valid_non_existing_blog() throws Exception {
        assertRequestWithBody("PUT", "/blog/1", "{\"content\": \"new blog\"}", 201);
    }
}
package com.solvedex.challenge.health_check;

import com.solvedex.challenge.blog.BlogChallengeApplicationTests;
import org.junit.jupiter.api.Test;


class HealthCheckGetControllerTest extends BlogChallengeApplicationTests {

    @Test
    void check_app_is_working_well() throws Exception{
        assertResponse("/health-check", 200, "{'application':'blog-challenge', 'status':'ok'}");
    }

}
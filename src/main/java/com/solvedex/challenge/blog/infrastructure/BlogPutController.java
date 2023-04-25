package com.solvedex.challenge.blog.infrastructure;

import com.solvedex.challenge.blog.application.create.BlogCreator;
import com.solvedex.challenge.blog.infrastructure.dto.BlogRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.PUT})
public class BlogPutController {

    private final BlogCreator service;

    public BlogPutController(BlogCreator service){this.service = service;}

    @PutMapping(value = "/blog/{id}")
    public ResponseEntity<String> index(
            @PathVariable String id,
            @RequestBody BlogRequest request){
        request.setId(id);
        service.create(null);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}

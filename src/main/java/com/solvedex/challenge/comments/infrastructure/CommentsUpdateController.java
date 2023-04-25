package com.solvedex.challenge.comments.infrastructure;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class CommentsUpdateController {

    @PutMapping(value = "/comment/{id}")
    public ResponseEntity<String> index(
            @PathVariable String id,
            @RequestBody CommentsUpdateController.RequestComment request){
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Getter
    @Setter
    final class RequestComment{
        private String text;
        private String author;
        private LocalDate dateComment;
    }
}

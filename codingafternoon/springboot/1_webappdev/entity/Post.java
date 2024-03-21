package com.example.webappdev.entitiy;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
@Data //겟,셋, 투스트링 다
@AllArgsConstructor
public class Post {
    private String postId;
    private String title;
    private String contents;
    private String author;
    private LocalDateTime createdDateTime;

}

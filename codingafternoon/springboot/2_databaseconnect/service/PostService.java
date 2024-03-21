package com.example.webappdev.service;

import com.example.webappdev.entitiy.Post;
import com.example.webappdev.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public List<Post> postList2() {
        return postRepository.findAll();
    }

    public List<Post> postList3(String title) {
//        return postRepository.findByTitle(title);
        return postRepository.findByTitleContains(title);

    }
}

package com.example.webappdev.repository;

import com.example.webappdev.entitiy.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface PostRepository extends JpaRepository<Post, UUID> {


    List<Post> findByTitle(String title);

    List<Post> findByTitleContains(String title);
}

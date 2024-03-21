package com.example.webappdev.controller;

import com.example.webappdev.entitiy.Post;
import com.example.webappdev.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

//    @Autowired
//    public PostController(PostService postService){ // 생성자로 주입을 받음
//        this.postService = postService;
//    }

    @GetMapping("")
    public String List(){
        return "get url 테스트 입니다!!";
    }
    //
//    //url 뒤 ? query 를 @PathVariable로 받음
//
//    // localhost:8080/posts/{}
    @GetMapping("/{postId}")  //여기 {V} 랑
    public String postDetailtest(@PathVariable String postId){ // 여기 V를 맞춰주면됨
        return postId +  "패스베리어블 url get 테스트입니다.";
    }

    //localhost:8080/posts/update?postId={}
    @GetMapping("/update")
    public String updatePost(@RequestParam String postId){
        return postId + "리퀘스트 파람 테스트입니다.";
    }

    @GetMapping("/list")
    public List<Post> postList(){
        return List.of(
                new Post(UUID.randomUUID(), "title1", "contents1", "", LocalDateTime.now()),
                new Post(UUID.randomUUID(), "title2", "contents2","", LocalDateTime.now()),
                new Post(UUID.randomUUID(), "title3", "contents3","", LocalDateTime.now())
        );
    }

    //url 뒤 ? query 를 @PathVariable로 받음

    // localhost:8080/posts/{}
    @GetMapping("/{postId2}")  //여기 {V} 랑
    public Post postDetail(@PathVariable String postId2){ // 여기 V를 맞춰주면됨
        return new Post(UUID.randomUUID(), "title1", "contents1", "", LocalDateTime.now());
    }


    //* 3강 Serivce 이용 부분
    @GetMapping("/list2")
    public List<Post> postList2(){
        return postService.postList2();
    }

    //Query Creation  쿼리 매서드
    @GetMapping("/list3")
    public List<Post> postList3(@RequestParam String title){
        return postService.postList3(title);
    }


    //localhost:8080/posts/update?postId={}
//    @GetMapping("/update")
//    public List<Post> updatePost(@RequestParam String postId){
//        return postId + "리퀘스트 파람 테스트입니다.";
//    }


//    @PostMapping

}

package com.example.webappdev.controller;

import com.example.webappdev.entitiy.Post;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

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
                new Post("1", "title1", "contents1", "", LocalDateTime.now()),
                new Post("2", "title2", "contents2","", LocalDateTime.now()),
                new Post("3", "title3", "contents3","", LocalDateTime.now())
        );
    }

    //url 뒤 ? query 를 @PathVariable로 받음

    // localhost:8080/posts/{}
    @GetMapping("/{postId}")  //여기 {V} 랑
    public Post postDetail(@PathVariable String postId){ // 여기 V를 맞춰주면됨
        return new Post("1", "title1", "contents1", "", LocalDateTime.now());
    }

    //localhost:8080/posts/update?postId={}
//    @GetMapping("/update")
//    public List<Post> updatePost(@RequestParam String postId){
//        return postId + "리퀘스트 파람 테스트입니다.";
//    }


//    @PostMapping

}

package com.example.standard.controller;

import com.example.standard.response.PostResponse;
import com.example.standard.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping("/posts/{id}")
    public PostResponse get(@PathVariable int id){
        return postService.get(id);
    }
}

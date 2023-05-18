package com.example.standard.controller;

import com.example.standard.entity.Post;
import com.example.standard.response.PostResponse;
import com.example.standard.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping
    public PostResponse get(){

        return null;
    }
}

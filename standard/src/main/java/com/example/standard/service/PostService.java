package com.example.standard.service;

import com.example.standard.entity.Post;
import com.example.standard.repository.MybatisPostRepository;
import com.example.standard.response.PostResponse;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PostService {
    private final MybatisPostRepository postRepository;
    public PostResponse get(int id) {
        Post post= postRepository.findById(id);
        return PostResponse.builder()
                .title(post.getTitle())
                .content(post.getContent())
                .build();
    }
}

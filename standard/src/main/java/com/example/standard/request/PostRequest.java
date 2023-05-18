package com.example.standard.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
public class PostRequest {
    private String title;
    private String content;

    @Builder
    public PostRequest(String title, String content) {
        this.title = title;
        this.content = content;
    }
}

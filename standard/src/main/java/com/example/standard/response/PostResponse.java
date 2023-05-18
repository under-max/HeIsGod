package com.example.standard.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostResponse {
    private String title;
    private String content;

    @Builder
    public PostResponse(String title, String content) {
        this.title = title;
        this.content = content;
    }
}

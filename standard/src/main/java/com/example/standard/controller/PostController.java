package com.example.standard.controller;
      
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PostController {

    @GetMapping
    public void get(){
        System.out.println("스스로 올리고 스스로 pull request하는 습관을 기릅시다");
        System.out.println("사장은 바지 사장입니다.");

    }
}

package com.example.standard.repository;

import com.example.standard.entity.Post;

public interface MybatisPostRepository {

    Post findById(int id);
}

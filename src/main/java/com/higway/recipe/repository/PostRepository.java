package com.higway.recipe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.higway.recipe.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long>{

}

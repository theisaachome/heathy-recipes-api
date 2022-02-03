package com.higway.recipe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.higway.recipe.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}

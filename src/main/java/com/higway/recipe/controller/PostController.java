package com.higway.recipe.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class PostController {
   
	@PostMapping()
	public ResponseEntity<?> createPost(){
		return new ResponseEntity<String>("",HttpStatus.CREATED);
	}
	
	@GetMapping
	public String getAllPosts() {
		return "get all post";
	}
	@GetMapping("/{id}")
	public String getPostById(@PathVariable(name="id") Long id) {
		return "get post by id";
	}
	@PutMapping("/{id}")
	public String updatePost(@PathVariable(name="id") Long id) {
		return "update post by id";
	}
	
	@DeleteMapping("/{id}")
	public String deletePost(@PathVariable(name="id")Long id) {
		return "delete post";
	}
}

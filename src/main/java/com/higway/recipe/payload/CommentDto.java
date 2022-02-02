package com.higway.recipe.payload;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class CommentDto {
	
	private Long id;

    @NotEmpty(message = "Name should not be null or empty")
	private String name;
    @NotEmpty(message = "Email shoul not be null or empty")
    @Email
	private String email;
	@NotEmpty
    @Size(min = 10, message = "Comment body must be minimum 10 caracters")
	private String body;

}

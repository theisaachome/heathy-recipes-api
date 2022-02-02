package com.higway.recipe.payload;

import java.util.Set;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class PostDto {


    private Long id;

    @Size(min = 2, message = "Post title should have at least 2 characteres")
    @NotEmpty
	private String title;

	@NotEmpty
    @Size(min = 2, message = "Post description should have at least 10 characteres")
	private String description;
    @NotEmpty
	private String content;
    
    private Set<CommentDto> comments;
	
}

package com.higway.recipe.entity;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "post",
uniqueConstraints = {@UniqueConstraint(columnNames = {"title"})})
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "title")
	private String title;
	private String description;
	private String content;
	@OneToMany(orphanRemoval = true,mappedBy = "post",cascade = CascadeType.ALL)
	private Set<Comment> comments=new HashSet<Comment>();
}

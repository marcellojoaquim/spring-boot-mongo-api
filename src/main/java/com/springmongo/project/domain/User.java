package com.springmongo.project.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Objects;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Document(collection = "user")
public class User implements Serializable{

	private static final long serialVersionUIDLONG = 1L;

	@Id
	private String id;
	private String name;
	private String email;

	
}

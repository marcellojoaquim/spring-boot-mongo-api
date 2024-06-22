package com.springmongo.project.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Post implements Serializable {
    private static final long serialVersionUIDLONG = 1L;

    @Id
    private String id;
    private Date date;
    private String title;
    private String body;
    private User author;
}
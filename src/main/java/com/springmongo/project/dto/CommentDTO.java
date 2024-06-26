package com.springmongo.project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentDTO implements Serializable {

    private static final long SerialVersionUIDLONG = 1L;

    private String text;
    private Date date;
    private AuthorDTO author;


}

package com.springmongo.project.resources.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StandardError implements Serializable {
    private static final long serialVersionUIDLONG = 1L;

    private Long timeStamp;
    private Integer status;
    private String error;
    private String message;
    private String path;
}

package com.springmongo.project.services.exception;

public class ObjectNotFoundException extends RuntimeException{

    private static final long serialVersionUIDLONG = 1L;

    public ObjectNotFoundException(String msg){
        super(msg);
    }
}

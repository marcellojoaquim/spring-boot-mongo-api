package com.springmongo.project.services;

import com.springmongo.project.domain.Post;
import com.springmongo.project.repository.PostRepository;
import com.springmongo.project.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    @Transactional
    public Post finById(String id){
        Optional<Post> post = repository.findById(id);
        return post.orElseThrow(()-> new ObjectNotFoundException("Object not found"));
    }

    @Transactional
    public List<Post> findByTitle(String text){
        return repository.findByTitleContainingIgnoreCase(text);
    }

    @Transactional
    public List<Post> findByTitleQuery(String text){
        return repository.findByTitle(text);
    }

    public List<Post> fullSearch(String text, Date minDate, Date maxDate){
        maxDate = new Date(maxDate.getTime()+24*60*60*1000);
        return repository.fullSearch(text, minDate, maxDate);
    }
}

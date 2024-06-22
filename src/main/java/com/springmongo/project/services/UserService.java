package com.springmongo.project.services;

import com.springmongo.project.domain.User;
import com.springmongo.project.dto.UserDTO;
import com.springmongo.project.repository.UserRepository;
import com.springmongo.project.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User finById(String id){
        Optional<User> user = repository.findById(id);
        return user.orElseThrow(()-> new ObjectNotFoundException("Object not found"));
    }

    public User insert(User obj){
        return repository.insert(obj);
    }

    public  void delete(String id){
        finById(id);
        repository.deleteById(id);
    }

    public User update(User obj){
        try {
            Optional<User> newUser = repository.findById(obj.getId());
            User user = newUser.get();
            updateData(user, obj);
            return  repository.save(user);
        }catch (NoSuchElementException e){
            throw new ObjectNotFoundException("Not Found");
        }
    }

    private void updateData(User newObj, User obj) {
        newObj.setName(obj.getName());
        newObj.setEmail(obj.getEmail());
    }

    public User fromDTO(UserDTO objDTO){
        return new User(objDTO.getId(), objDTO.getName(), objDTO.getEmail());
    }
}

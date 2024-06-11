package com.springmongo.project.resources;

import java.util.List;
import java.util.stream.Collectors;

import com.springmongo.project.dto.UserDTO;
import com.springmongo.project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmongo.project.domain.User;


@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll() {
        List<User> list = service.findAll();
        List<UserDTO> listDto = list.stream()
                .map(obj -> new UserDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }


}

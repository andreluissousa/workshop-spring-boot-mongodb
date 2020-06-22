package com.workshop.workshopmongo.resources;

import java.util.List;
import com.workshop.workshopmongo.domain.User;
import com.workshop.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {

    @Autowired
    private UserService service;
    
    @GetMapping
    public ResponseEntity<List<User>> findAll() {        
        List<User> list = service.findAll();        
        return ResponseEntity.ok().body(list);
    }

}
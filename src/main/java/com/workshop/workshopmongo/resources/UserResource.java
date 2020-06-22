package com.workshop.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.workshop.workshopmongo.domain.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {
    
    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        User andre = new User("1", "Andre Borges", "andreborges1777@gmail.com");
        User luiz = new User("2", "Luiz", "luiz@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(andre, luiz));
        return ResponseEntity.ok().body(list);
    }

}
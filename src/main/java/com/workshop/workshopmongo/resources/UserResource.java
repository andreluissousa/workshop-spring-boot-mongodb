package com.workshop.workshopmongo.resources;

import java.util.List;
import java.util.stream.Collectors;
import com.workshop.workshopmongo.domain.User;
import com.workshop.workshopmongo.dto.UserDTO;
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
    public ResponseEntity<List<UserDTO>> findAll() {        
        List<User> list = service.findAll();        
        List<UserDTO> listDTO = list.stream()
                .map( u -> new UserDTO(u))
                .collect(Collectors
                .toList());
        return ResponseEntity.ok().body(listDTO);
    }

}
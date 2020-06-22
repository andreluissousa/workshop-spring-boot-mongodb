package com.workshop.workshopmongo.services;

import java.util.List;

import com.workshop.workshopmongo.domain.User;
import com.workshop.workshopmongo.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }
}
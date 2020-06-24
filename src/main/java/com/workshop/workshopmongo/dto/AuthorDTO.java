package com.workshop.workshopmongo.dto;

import java.io.Serializable;

import com.workshop.workshopmongo.domain.User;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AuthorDTO implements Serializable{
    
   
    private static final long serialVersionUID = 1L;
    
    private String id;
    private String nome;

    public AuthorDTO(User obj){
        this.id = obj.getId();
        this.nome = obj.getNome();
    }
}
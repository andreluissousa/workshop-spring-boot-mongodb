package com.workshop.workshopmongo.dto;

import java.io.Serializable;
import com.workshop.workshopmongo.domain.User;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDTO implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private String id;
    private String nome;
    private String email;

    public UserDTO(User obj) {
        this.id = obj.getId();
        this.nome = obj.getNome();
        this.email = obj.getEmail();
    }
}
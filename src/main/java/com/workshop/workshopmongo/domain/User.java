package com.workshop.workshopmongo.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Document
public class User implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @Id
    private String id;
    private String nome;
    private String email;
}
package com.workshop.workshopmongo.domain;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class User implements Serializable{

    private static final long serialVersionUID = 1L;
    
    private String id;
    private String name;
    private String emal;
}
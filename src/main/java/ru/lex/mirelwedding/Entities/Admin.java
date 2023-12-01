package ru.lex.mirelwedding.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Admin {

    @Id
    Integer id;
    String name;
    String type;
    String password;



}

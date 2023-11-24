package ru.lex.mirelwedding.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Workers {
    @Id
    Integer id;
    String name;
    String type;
    String password;

}

package ru.lex.mirelwedding.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Users {
    @Id
    Integer id;
    String name;
    Integer age;
    String emailOrPhone;
    Boolean active;
    Integer dayOfWedding;

}

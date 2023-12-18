package ru.lex.mirelwedding.Entities.Users;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    @Id
    Integer id;
    String name;
    Integer age;
    String emailOrPhone;
    Boolean active;
    Integer dayOfWedding;

    public Users(String name, Integer age, String emailOrPhone, Boolean active, Integer dayOfWedding) {
        this.name = name;
        this.age = age;
        this.emailOrPhone = emailOrPhone;
        this.active = active;
        this.dayOfWedding = dayOfWedding;
    }
}

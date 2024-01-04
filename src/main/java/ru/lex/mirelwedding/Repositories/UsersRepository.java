package ru.lex.mirelwedding.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.lex.mirelwedding.Entities.Users;

public interface UsersRepository extends JpaRepository<Users,Integer> {
    Users findByName(String name);

    void deleteByName(String userName);


}

package ru.lex.mirelwedding.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.lex.mirelwedding.Entities.Admin;

public interface AdminRepository extends JpaRepository<Admin,Integer> {
    void deleteById(Integer id);
}

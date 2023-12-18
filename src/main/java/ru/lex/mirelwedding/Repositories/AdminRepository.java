package ru.lex.mirelwedding.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.lex.mirelwedding.Entities.Admin.Admin;

public interface AdminRepository extends JpaRepository<Admin,Integer> {
}

package ru.lex.mirelwedding.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.lex.mirelwedding.Entities.Workers;

public interface WorkersRepository extends JpaRepository<Workers,Integer> {
    Workers findByName(String anastas);

    void deleteByName(String workerName);
}

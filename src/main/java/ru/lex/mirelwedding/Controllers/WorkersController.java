package ru.lex.mirelwedding.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import ru.lex.mirelwedding.Entities.Users;
import ru.lex.mirelwedding.Entities.Workers;
import ru.lex.mirelwedding.Repositories.UsersRepository;
import ru.lex.mirelwedding.Repositories.WorkersRepository;

public class WorkersController {
    private WorkersRepository workersRepository;
    @GetMapping("addWorker")
    public void AddWorkers(){
        Workers worker = new Workers(1,"Anastas", "DJ", "123456");
        workersRepository.save(worker);
    }
    @GetMapping("deleteWorker")
    public void DeleteWorkers(String name){
        String workerName = workersRepository.findByName(String name);
        workersRepository.deleteByName(workerName);
    }
    @GetMapping("searchWorker")
    public Workers SearchWorkers(String name){
        return workersRepository.findByName("Anastas");
    }
    @GetMapping("editWorker")
    public void EditWorkers(){
        Workers worker = workersRepository.getReferenceById(1);
        worker.setName("DJonny");
        workersRepository.save(worker);
    }
}

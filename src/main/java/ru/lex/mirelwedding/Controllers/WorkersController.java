package ru.lex.mirelwedding.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import ru.lex.mirelwedding.Entities.Users;
import ru.lex.mirelwedding.Entities.Workers;
import ru.lex.mirelwedding.Repositories.UsersRepository;
import ru.lex.mirelwedding.Repositories.WorkersRepository;

public class WorkersController {
    private WorkersRepository workersRepository;
    @GetMapping("addWorker")
    public void AddWorkers(){ //Нужно получать POST запрос,
        // из его тела забирать данные, записывать их в новый объект и сохранять в БД.
        Workers worker = new Workers(1,"Anastas", "DJ", "123456");
        workersRepository.save(worker);
    }
    @GetMapping("deleteWorker")
    public void DeleteWorkers(String name){ //Метод реализован не верно. Следует получать ID пользователя.
        String workerName = workersRepository.findByName(String name); //Инициализация переменной
        // реализована не верно, данный метод вернет не строку, а объект Workers.
        workersRepository.deleteByName(workerName);
    }
    @GetMapping("searchWorker")
    public Workers SearchWorkers(String name){
        return workersRepository.findByName("Anastas");
    } //метод не реализует использование входящего параметра для работы с разными сущностями в БД
    @GetMapping("editWorker")
    public void EditWorkers(){ //Метод не реализует возможность изменять параметры сущности.
        Workers worker = workersRepository.getReferenceById(1);
        worker.setName("DJonny");
        workersRepository.save(worker);
    }
}

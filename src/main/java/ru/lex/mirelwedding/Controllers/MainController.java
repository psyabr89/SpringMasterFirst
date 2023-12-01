package ru.lex.mirelwedding.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.lex.mirelwedding.Entities.Users;
import ru.lex.mirelwedding.Repositories.UsersRepository;

@RestController
@AllArgsConstructor
@RequestMapping("test")
public class MainController {
    private UsersRepository usersRepository;
    @GetMapping("get")
    public Users search(){
        return null;
    }
    @GetMapping("new")
    public void newUser(){}
    @GetMapping("edit")
    public void edit(){

    }



//    @GetMapping("start")
//
//    public void AddUsers(String name){
//    }
//    public void DeleteUsers(String name){
//    }
//
//    public void SearchUsers(String name){
//
//    }
//
//    public void ChangeUsers(String name){
//
//    }
//    public void AddAdmin(String name){
//    }
//    public void DeleteAdmin(String name){
//    }
//
//    public void SearchAdmin(String name){
//
//    }
////new cooments
//    public void ChangeAdmin(String name){
//
//    }
//    public void AddWorkers(String name){
//    }
//    public void DeleteWorkers(String name){
//    }
//
//    public void SearchWorkers(String name){
//
//    }
//
//    public void ChangeWorkers(String name){
//
//    }
//    add database

}


package ru.lex.mirelwedding.Controllers;

        import lombok.AllArgsConstructor;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;
        import ru.lex.mirelwedding.Entities.Users;
        import ru.lex.mirelwedding.Repositories.UsersRepository;

@RestController
@AllArgsConstructor
@RequestMapping("startUsers")
public class UsersController {
    private UsersRepository usersRepository;
    @GetMapping("getUser")
    public Users search(){

        return usersRepository.findByName("Grigoriy");
    }
    @GetMapping("newUser")
    public void newUser(){
        Users user = new Users(1,"Vasily", 28, "89656886543", true, 31);
        usersRepository.save(user);
    }
    @GetMapping("editUser")
    public void edit(){
        Users user = usersRepository.getReferenceById(1);
        user.setName("Grigoriy");
        usersRepository.save(user);

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
//


}


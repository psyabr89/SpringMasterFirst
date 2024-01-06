
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
    } //Непосредственно в метод не передается параметр, по которому мы ищем пользователя.
    @GetMapping("newUser")
    public void newUser(){ //Метод должен принимать POST запрос и из тела запроса вытягивать параметры,
        // которые нужны для создания объекта, а затем сохранять их в базу.
        Users user = new Users(1,"Vasily", 28, "89656886543", true, 31);
        usersRepository.save(user);
    }
    @GetMapping("editUser")
    public void editUser(){ //Рефакторинг не реализован
        Users user = usersRepository.getReferenceById(1);
        user.setName("Grigoriy");
        usersRepository.save(user);
    }

    @GetMapping("deleteUser")
    public void deleteUser(String name){ //Метон не реализован корректно. Следует получать ID пользователя.
        String userName = usersRepository.findByName(String name); //При вызове метода мы не даем ему в параметрах
        // описание переменной, а отдаем саму переменную
        usersRepository.deleteByName(userName); // такое имя корректно указывается username. Скорее исключение из правил
    }
}


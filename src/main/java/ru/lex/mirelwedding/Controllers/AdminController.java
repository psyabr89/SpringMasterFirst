package ru.lex.mirelwedding.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.lex.mirelwedding.Entities.Admin;
import ru.lex.mirelwedding.Entities.Users;
import ru.lex.mirelwedding.Repositories.AdminRepository;

@RestController
@AllArgsConstructor
@Service
@RequestMapping("startAdmin")
public class AdminController {

        private AdminRepository adminRepository;
        @GetMapping("getAdmin")
        public Admin SearchAdmin(String name){

            return adminRepository.findByName("Grigoriy"); //Метод не реализован в репозитории
        }

        @GetMapping("newAdmin")
        public void newAdmin(){
            Admin admin = new Admin();   // В даннном случае в БД будет создана пустая запись, что недопустимо.
            // Следует полностью заполнять поля объекта при создании сущности
            adminRepository.save(admin);
        }
        @GetMapping("editAdmin")
        public void ChangeAdmin(String name){ //Данный метод не сделан рефакторинг.
            // Метод должен находить сущность в базе по требуемым параметрам, получать POST запрос
            // с телом изменений, менять их в сущности и записывать в базу. В этом суть работы данного метода.
            Admin admin = adminRepository.getReferenceById(1);
            admin.setName("Grigoriy");
            adminRepository.save(admin);

        }

    @Autowired
    public void DeleteAdmin(AdminRepository adminRepository){ //Метод оеализован некорректно.
            // Метод должен находить объект по ID и удалять из БД.
            this.adminRepository = adminRepository;
            Admin admin = new Admin();
            adminRepository.save(admin);

    }

}

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
//    @Service
//    public class YourService {
//        private final YourEntityRepository yourEntityRepository;
//
//
//
//        // ... остальные методы сервиса
//    }
        private AdminRepository adminRepository;
        @GetMapping("getAdmin")
        public Admin SearchAdmin(String name){

            return adminRepository.findByName("Grigoriy");
        }

        @GetMapping("newAdmin")
        public void newAdmin(){
            Admin admin = new Admin();
            adminRepository.save(admin);
        }
        @GetMapping("editAdmin")
        public void ChangeAdmin(String name){
            Admin admin = adminRepository.getReferenceById(1);
            admin.setName("Grigoriy");
            adminRepository.save(admin);

        }

    @Autowired
    public void DeleteAdmin(AdminRepository adminRepository){

            this.adminRepository = adminRepository;
        Admin admin;
        adminRepository.save(admin);

    }

}

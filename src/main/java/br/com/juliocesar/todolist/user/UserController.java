package br.com.juliocesar.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users") // rota para os usuarios
public class UserController {

    private IUserRepository userRepository; //aqui chamnamos a nossa interfacce

    @PostMapping("/")
    public UserModel create(@RequestBody UserModel userModel){
        var userCreated = this.userRepository.save(userModel);
        return userCreated;
    }
}

package de.telran.tinder;

import de.telran.tinder.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Сервисный КЛАСС управляется СПРИНГОМ!!!!!!
@RestController  // Это входная точка, можно ТОЛЬКО вызвать что то, но не для расчетов и прочих подобных операций.
@RequiredArgsConstructor //надо разобрать Аннотацию.
public class UserController {
    //Находит UserService в контексте приложения и внедряет зависимость(заполняет переменную)
    private  final UserService userService;

    //точка доступа

    @GetMapping(value = "/show-new-user")
    public User showNewUser(){
        return userService.getNewUser();
    }


    @GetMapping(value="/show-all-users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping(value = "/show-shortname-user")
    public User getShortNameUser(){
        return userService.getShortNameUser();
    }

}

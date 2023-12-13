package de.telran.tinder.service;

import de.telran.tinder.User;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
//Включаем Праймари, пока так, чтобы вызвался именно этот сервис для пункта 1.
//@Primary
public class GetAllUserService implements UserService {

    @Override
    public User getNewUser() {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        //Так как начал делать без БД то тупо через костыли.
        List<User> users = new ArrayList<>();
        User Eugen = new User(1, "Eugen",1,"Student");
        User Natalie = new User(2, "Natalie",5,"Gorgius Woman");
        User Polina = new User(3, "Polina",4,"Very Very smart Lady");
        User Stefanija = new User(4, "Stefanija",3,"Very Very Cute");
        users.add(Eugen);
        users.add(Natalie);
        users.add(Polina);
        users.add(Stefanija);
        return users;
    }

    @Override
    public User getShortNameUser() {
        return null;
    }
}

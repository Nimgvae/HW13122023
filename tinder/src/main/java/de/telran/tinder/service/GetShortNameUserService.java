package de.telran.tinder.service;

import de.telran.tinder.User;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
//Та же схема.
@Primary
public class GetShortNameUserService implements UserService{
    @Override
    public User getNewUser() {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User getShortNameUser() {
        List<User> users = new ArrayList<>();
        User Eugen = new User(1, "Eugen",1,"Student");
        User Natalie = new User(2, "Natalie",5,"Gorgius Woman");
        User Polina = new User(3, "Polina",4,"Very Very smart Lady");
        User Stefanija = new User(4, "Stefanija",3,"Very Very Cute");
        User Bob = new User(5, "Bob",5,"Very Very Cute Guy");
        users.add(Eugen);
        users.add(Natalie);
        users.add(Polina);
        users.add(Stefanija);
        users.add(Bob);
        int nameLenght=users.get(0).getName().length();
        User shortNameUser=null;
        for (User user : users) {
            if(user.getName().length()<nameLenght){
                nameLenght=user.getName().length();
                shortNameUser=user;
            }
        }


        return shortNameUser;
    }
}

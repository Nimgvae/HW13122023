package de.telran.tinder.service;

import de.telran.tinder.User;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*

 */
@Service //Аннотация которая  тоже что и Component, но более явно указывает, что ЭТО СЕРВИС(уровень Сервиса). Component это более общее понятие.
//ВКЛ/ВЫКЛ
//@Primary
public class RandomUserService implements UserService {
    @Override
    public User getNewUser(){
        //Тут просто пока делаем "затычку"  для базы данных.
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
        Random random = new Random();
        int randuser = random.nextInt(4);

        return users.get(randuser);
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User getShortNameUser() {
        return null;
    }

}

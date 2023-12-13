package de.telran.tinder.service;

import de.telran.tinder.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
//@Primary
public class TopRatingUserService implements UserService {


    @Override
    public User getNewUser() {
        List<User> users = new ArrayList<>();
        User Eugen = new User(1, "Eugen",1,"Student");
        User Natalie = new User(2, "Natalie",5,"Gorgius Woman");
        User Polina = new User(3, "Polina",4,"Very Very smart Lady");
        User Stefanija = new User(4, "Stefanija",3,"Very Very Cute");
        users.add(Eugen);
        users.add(Natalie);
        users.add(Polina);
        users.add(Stefanija);
        int maxRating = 0;
        User bestuser = null;
        for (User user : users) {
            if(user.getRating()>maxRating){
                maxRating = user.getRating();
                bestuser=user;
            }
        }
        return bestuser;
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

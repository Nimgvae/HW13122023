package de.telran.tinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TinderApplication {

    public static void main(String[] args) {
        SpringApplication.run(TinderApplication.class, args);
    }

}


/*
* Важно понимать, что в Спринге есть Классы(как правило сервисные), которые админит Спринг, а есть те который делаю Я.
* POJO - Plain old java object - старый добрый джава объект, которые СОЗДАЮ Я и они подчинаются МНЕ.
*
*
* */
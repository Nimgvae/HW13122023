package de.telran.tinder;

import lombok.*;

//POJO class
//User класс описаывает СТРУКТУРУ данных.
//Нужны Геттры и Сеттры, НО мы добавили LOMBOC поэтому мы юзаем АННОТАЦИИ Lomboc
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
@Data //Аннотация включающая ВСЕ выше стоящие 8-11 + пустой конструктор
@AllArgsConstructor
public class User {
    private final long id; //long потому что мы расчитываем на весь мир.
    private String name;
    private int rating;
    private String description;
}

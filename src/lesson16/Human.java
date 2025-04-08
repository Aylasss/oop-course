package lesson16;

import java.time.LocalDate;

public abstract class Human {
    public String id;
    public String name;
    public String surname;


    public Human (String id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

}

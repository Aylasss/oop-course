package lesson16;

import java.time.LocalDate;

public abstract class Human {
    protected String id;
    protected String name;
    protected String surname;
    protected LocalDate birthDate;


    public Human (String id, String name, String surname, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

}

package pl.kurs.java.model;


import pl.kurs.java.exceptions.AgeMustBeMoreThanZeroException;
import pl.kurs.java.exceptions.NameIsNullExceptions;
import pl.kurs.java.exceptions.SurnameIsNullException;

import java.util.ArrayList;
import java.util.List;

public class Kid {
    private String name;
    private String surname;
    private int age;

    private Check check;

    public List<DrugDealer> drugs = new ArrayList<>();

    public Kid(String name, String surname, int age) {
        if (name == null) {
            throw new NameIsNullExceptions("Name is null.");
        }
        if (surname == null) {
            throw new SurnameIsNullException("Surname is null.");
        }
        if(age < 0){
            throw new AgeMustBeMoreThanZeroException("Age is less than zero");
        }
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public List<DrugDealer> getDrugs() {
        Check.dead(drugs);
        return drugs;
    }

    @Override
    public String toString() {
        return "Kid{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
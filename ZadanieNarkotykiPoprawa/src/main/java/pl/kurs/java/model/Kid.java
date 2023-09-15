package pl.kurs.java.model;

import pl.kurs.java.exceptions.TheKidIsAlreadyDeadException;

import java.util.ArrayList;
import java.util.List;

public class Kid {
    private String name;
    private String surname;
    private int age;
    private List<Drug> ddrugs = new ArrayList<>();

    public Kid(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void buyDrug(Drug drug){
        if (ddrugs.size() >= 5){
            throw new TheKidIsAlreadyDeadException();
        }
        ddrugs.add(drug);
        drug.addKid(this);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public List<Drug> getDdrugs() {
        return ddrugs;
    }

    @Override
    public String toString() {
        return "Kid{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}

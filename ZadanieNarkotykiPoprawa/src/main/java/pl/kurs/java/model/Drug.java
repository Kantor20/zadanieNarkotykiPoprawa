package pl.kurs.java.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Drug {
    String name;
    double price;
    List<Ingredient> ingredients;
    boolean zlaJakosc;
    List<Kid> kids = new ArrayList<>();
    private Kid kid;

    public Drug(String neme, List<Ingredient> ingredients) {
        this.name = neme;
        this.ingredients = ingredients;
        calculatePrice();
    }

    public Kid getKid() {
        return kid;
    }

    public abstract void calculatePrice();

    public void addKid(Kid kid) {
        this.kid = kid;
        kids.add(kid);
    }

    public List<Kid> getKids() {
        return kids;
    }

    @Override
    public String toString() {
        return "Drug{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

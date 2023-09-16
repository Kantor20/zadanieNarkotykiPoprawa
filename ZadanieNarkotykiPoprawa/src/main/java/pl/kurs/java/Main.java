package pl.kurs.java;

import pl.kurs.java.model.Ingredient;
import pl.kurs.java.model.Kid;
import pl.kurs.java.model.Lsd;
import pl.kurs.java.model.Mdma;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ingredient i1 = new Ingredient("Sugar", 10);
        Ingredient i2 = new Ingredient("Water", 5);
        Ingredient i3 = new Ingredient("Strawberry", 4);
        Ingredient i4 = new Ingredient("Maka", 8);
        Ingredient i5 = new Ingredient("Cukierpuder", 2);

        List<Ingredient> ingredientsToLsd = List.of(i1,i3,i5);
        List<Ingredient> ingredientsToMdma = List.of(i1,i2,i3);

        Kid k1 = new Kid("Janek", "Kowalski",15);
        Kid k2 = new Kid("Mateusz", "nowak",11);
        Kid k3 = new Kid("Damian", "zajac",12);

        Lsd lsd = new Lsd("lsd", ingredientsToLsd, 6);
        Mdma mdma = new Mdma("mdma", ingredientsToMdma, 5);

        k1.buyDrug(lsd);
        k3.buyDrug(lsd);
        k1.buyDrug(mdma);

        lsd.addKid(k3);
        lsd.calculatePrice();

        System.out.println(k1.getDdrugs());
        System.out.println(lsd.getKids());
    }
}

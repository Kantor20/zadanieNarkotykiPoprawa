package pl.kurs.java.model;

import java.util.List;

public class Mdma extends Drug{
    int faza;

    public Mdma(String neme, List<Ingredient> ingredients, int faza) {
        super(neme, ingredients);
        this.faza = faza;
    }

    @Override
    public void calculatePrice() {
        double ingredientsCost = ingredients.stream()
                .mapToDouble(i -> i.price)
                .sum();
        this.price = ingredientsCost * 2.0;
    }
}

package pl.kurs.java.model;

import java.util.List;

public class Lsd extends Drug{
    int dragons;

    public Lsd(String neme, List<Ingredient> ingredients, int dragons) {
        super(neme, ingredients);
        this.dragons = dragons;
    }

    @Override
    public void calculatePrice() {
        double ingredientsCost = ingredients.stream()
                .mapToDouble(i -> i.price)
                .sum();
        this.price = ingredientsCost * 1.5;
    }
}

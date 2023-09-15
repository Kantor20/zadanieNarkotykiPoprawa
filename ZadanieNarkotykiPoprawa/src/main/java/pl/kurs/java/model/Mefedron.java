package pl.kurs.java.model;

import java.util.List;

public class Mefedron extends Drug{
    private String mina;

    public Mefedron(String neme, List<Ingredient> ingredients, String mina) {
        super(neme, ingredients);
        this.mina = mina;
    }

    @Override
    public void calculatePrice() {
        double ingredientsCost = ingredients.stream()
                .mapToDouble(i -> i.price)
                .sum();
        this.price = ingredientsCost * 1.7;
    }
}

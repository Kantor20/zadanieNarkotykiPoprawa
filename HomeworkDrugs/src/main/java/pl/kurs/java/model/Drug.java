package pl.kurs.java.model;

import pl.kurs.java.exceptions.NameIsNullExceptions;
import pl.kurs.java.exceptions.NotEnoughIngrediensInDrugException;
import pl.kurs.java.exceptions.PriceIsLessThanZeroException;

import java.util.ArrayList;
import java.util.List;

public abstract class Drug {
    private String name;
    private double pricePerGram;
    private final int quality = 100;
    private List<Ingredients> ingredients;

    public List<DrugDealer> drugs = new ArrayList<>();

    public Drug(String name, double pricePerGram, List<Ingredients> ingredients) {
        if (ingredients.size() < 3) {
            throw new NotEnoughIngrediensInDrugException("ingrediens is less than 3");
        }
        if(name == null){
            throw new NameIsNullExceptions("Name can't be null");
        }
        if(pricePerGram < 0){
            throw new PriceIsLessThanZeroException("Price can't less than zero");
        }
        this.name = name;
        this.pricePerGram = pricePerGram;
        this.ingredients = ingredients;
    }

    public abstract double countPrice();

    public double getPricePerGram() {
        return pricePerGram;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }
    public List<DrugDealer> getDrugs() {
        return drugs;
    }


    @Override
    public String toString() {
        return "Drug{" +
                "name='" + name + '\'' +
                ", pricePerGram=" + pricePerGram +
                ", ingredients=" + ingredients +
                '}';
    }

}
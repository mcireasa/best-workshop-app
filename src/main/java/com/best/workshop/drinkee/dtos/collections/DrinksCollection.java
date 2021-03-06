package com.best.workshop.drinkee.dtos.collections;

import com.best.workshop.drinkee.dtos.Drink;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Collections;
import java.util.List;

public class DrinksCollection {
    private final List<Drink> drinks;

    @JsonCreator
    public DrinksCollection(@JsonProperty("drinks") List<Drink> drinks) {
        this.drinks = Collections.unmodifiableList(drinks);
    }

    public List<Drink> getDrinks() {
        return drinks;
    }
}

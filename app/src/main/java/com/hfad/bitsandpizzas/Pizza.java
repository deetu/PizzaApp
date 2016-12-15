package com.hfad.bitsandpizzas;

import java.util.ArrayList;

/**
 * Created by adedayo on 14/12/2016.
 */

public class Pizza {
    private String name;
    private int imageResourceId;

    private static Pizza[] mPizzaArray = {new Pizza("Diavolo", R.drawable.diavolo), new Pizza("Funghi", R.drawable.funghi)};


    private static ArrayList<Pizza> getPizzasArray(){
        ArrayList<Pizza> pizza = new ArrayList<>();
        for (int i = 0; i < 2; i++){
            for (int x = 0; x < 5; x++){
                pizza.add(mPizzaArray[i]);

            }

        }
        return pizza;
    }

    public static final ArrayList<Pizza> pizzas = getPizzasArray();

    private Pizza(String name, int imageResourceId){
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName(){
        return name;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }

}

package com.hfad.bitsandpizzas;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by adedayo on 15/12/2016.
 */

public class Pasta {

    private String name;
    private int imageResourceId;

    private static Pasta[] mPastasArray = { new Pasta("Spaghetti Bolognese", R.drawable.spag_bol), new Pasta("lasagne", R.drawable.lasagne)};

    private static ArrayList<Pasta> getmPastasArray(){
        ArrayList<Pasta> pasta = new ArrayList<>();
        for (int i = 0; i < 2; i++){
            for (int x = 0; x < 5; x++){
                pasta.add(mPastasArray[i]);

            }

        }
        return pasta;
    }

    public static final ArrayList<Pasta> pastas = getmPastasArray();

    private Pasta(String name, int imageResourceId){
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

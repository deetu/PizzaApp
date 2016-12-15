package com.hfad.bitsandpizzas;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class PizzaMaterialFragment extends Fragment {


    public PizzaMaterialFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        RecyclerView pizzaRecycler = (RecyclerView)inflater.inflate(R.layout.fragment_pizza_material, container, false);
        int pizzaLength = Pizza.pizzas.length;

        String[] pizzaNames = new String[pizzaLength];
        for(int i = 0; i < pizzaLength; i++){
            pizzaNames[i] = Pizza.pizzas[i].getName();
        }

        int[] pizzaImages = new int[pizzaLength];
        for (int i = 0; i < pizzaLength; i++){
            pizzaImages[i] = Pizza.pizzas[i].getImageResourceId();
        }

        CaptionedImageAdapter adapter = new CaptionedImageAdapter(pizzaNames, pizzaImages);
        pizzaRecycler.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        pizzaRecycler.setLayoutManager(layoutManager);

        return pizzaRecycler;
        // Inflate the layout for this fragment
    }

}

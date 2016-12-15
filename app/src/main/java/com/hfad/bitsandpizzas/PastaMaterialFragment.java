package com.hfad.bitsandpizzas;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class PastaMaterialFragment extends Fragment {


    public PastaMaterialFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        RecyclerView pastaRecycler = (RecyclerView) inflater.inflate(R.layout.fragment_pasta_material, container, false);

        int pastaLength = Pasta.pastas.length;

        String[] pastanames = new String[pastaLength];
        int[] pastaImages = new int[pastaLength];

        for (int i = 0; i < pastaLength; i++){
            pastanames[i] = Pasta.pastas[i].getName();
        }

        for (int i = 0; i < pastaLength; i++){
            pastaImages[i] = Pasta.pastas[i].getImageResourceId();
        }

        CaptionedImageAdapter adapter = new CaptionedImageAdapter(pastanames, pastaImages);
        pastaRecycler.setAdapter(adapter);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        pastaRecycler.setLayoutManager(gridLayoutManager);

        return pastaRecycler;
        // Inflate the layout for this fragment
    }

}

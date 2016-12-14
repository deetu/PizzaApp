package com.hfad.bitsandpizzas;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * Created by adedayo on 14/12/2016.
 */

public class CaptionedImageAdapter extends RecyclerView.Adapter<CaptionedImageAdapter.ViewHolder> {


    public static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView mCardView;
        public ViewHolder(CardView v){
            super(v);
            mCardView = v;
        }

    }
    @Override
    public CaptionedImageAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

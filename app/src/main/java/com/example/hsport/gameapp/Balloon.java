package com.example.hsport.gameapp;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.hsport.gameapp.utils.PixelHelper;

public class Balloon extends ImageView {


    public Balloon(Context context) {
        super(context);
    }


    public Balloon(Context context, int color, int rawHeight) {
        super(context);

        this.setImageResource(R.drawable.balloon);
        this.setColorFilter(color);

        int rawWidth = rawHeight / 2;

        int dpHeight = PixelHelper.pixelsToDp(rawHeight, context);
        int dpWidth = PixelHelper.pixelsToDp(rawWidth, context);

        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(dpWidth, dpHeight);
        setLayoutParams(params);


    }

}

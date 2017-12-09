package com.example.emad.sheypoor;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by emad on 04/12/2017.
 */

public class MyButtonBold extends android.support.v7.widget.AppCompatButton {
    public MyButtonBold(Context context) {
        super(context);
        init();
    }

    public MyButtonBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyButtonBold(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public void init(){
        if (!isInEditMode()){
            Typeface Font=Typeface.createFromAsset(getContext().getAssets(),"Font/IRANYekanMobileBold.ttf");
            this.setTypeface(Font);
        }
    }
}

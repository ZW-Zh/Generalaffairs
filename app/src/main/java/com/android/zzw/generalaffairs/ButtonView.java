package com.android.zzw.generalaffairs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by zzw on 2017/9/10.
 */

public class ButtonView extends LinearLayout {

    private ImageView roundImg;
    private TextView textView;
    public ButtonView(Context context, AttributeSet attrs) {
        super(context,attrs);
        LayoutInflater.from(context).inflate(R.layout.buttonview, this);
        roundImg = (ImageView) findViewById(R.id.img);
        textView = (TextView) findViewById(R.id.text);
    }
    public void setButtonListener(OnClickListener listener){
        roundImg.setOnClickListener(listener);
    }
    public void setRoundImg(int id){
        roundImg.setImageResource(id);
    }
    public void setTextView(String text){
        textView.setText(text);
    }
}

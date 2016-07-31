package com.example.zhuangqf.buttomdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by zhuangqf on 7/30/16.
 */
public class LevelView extends Button {

    int maxCount;
    int startCount;
    int step;
    int count;
    int background;

    public LevelView(Context context) {
        super(context);
    }

    public LevelView(final Context context, AttributeSet attributes) {
        super(context, attributes);
        maxCount = attributes.getAttributeIntValue("LevelView", "maxCount", 100);
        startCount = attributes.getAttributeIntValue("LevelView", "startCount", 0);
        step = attributes.getAttributeIntValue("LevelView", "step", 1);
        background = attributes.getAttributeResourceValue("Level", "background", R.drawable.level_button);
        count = startCount;
        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                count = (step+count)%maxCount+startCount;
                getBackground().setLevel(count);
                setText(String.valueOf(count));
                setTextSize(50);
            }
        });
        setBackgroundResource(background);
        setText(String.valueOf(startCount));
    }
}
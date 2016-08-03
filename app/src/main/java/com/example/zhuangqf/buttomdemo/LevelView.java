package com.example.zhuangqf.buttomdemo;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

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

        final TypedArray a = getContext().obtainStyledAttributes(attributes, R.styleable.LevelView, 0, 0);

        maxCount = a.getInt(R.styleable.LevelView_maxCount,100);
        startCount = a.getInt(R.styleable.LevelView_startCount,0);
        step = a.getInt(R.styleable.LevelView_step,1);
        background = a.getResourceId(R.styleable.LevelView_backgroung,R.drawable.level_button);
        count = startCount;
        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count<maxCount) count++;
                getBackground().setLevel(count);
                setText(String.valueOf(count));
                setTextSize(50);
            }
        });
        setBackgroundResource(background);
        setText(String.valueOf(startCount));
    }
}
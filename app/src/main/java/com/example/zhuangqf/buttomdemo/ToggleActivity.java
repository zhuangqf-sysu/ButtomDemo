package com.example.zhuangqf.buttomdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

public class ToggleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle);

        ToggleButton toggleButton = (ToggleButton)findViewById(R.id.toggle_button);
        toggleButton.setChecked(false);
        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button mBn = (Button) v.findViewById(R.id.button);
                mBn.setSelected(!mBn.isSelected());
                mBn.setText(mBn.isSelected() ? "ON" : "OFF");
            }
        });
        button.setSelected(false);
    }
}

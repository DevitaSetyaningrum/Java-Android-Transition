package com.example.transition;

import android.graphics.drawable.TransitionDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    Button btn;
    Boolean turunOn=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = (ImageView)findViewById(R.id.imgview);
        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!turunOn){
                    img.setImageResource(R.drawable.trans_on);
                    ((TransitionDrawable)img.getDrawable()).startTransition(3000);
                    turunOn=true;
                }else {
                    img.setImageResource(R.drawable.trans_off);
                    ((TransitionDrawable)img.getDrawable()).startTransition(3000);
                    turunOn=false;
                }
            }
        });

    }
}

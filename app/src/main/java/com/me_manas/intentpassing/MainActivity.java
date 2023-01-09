package com.me_manas.intentpassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn= findViewById(R.id.screenB);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Inside onclick of btn, we need an object of intent with parameterized constructor accepting source and destination contexts
                //then using startActivity method to dive into next activity.

                Intent i=new Intent(MainActivity.this,ScreenB.class);
                startActivity(i);
            }
        });
    }
}
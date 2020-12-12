package com.example.thecoffeehouse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.thecoffeehouse.bottomNavigation.Tintuc;

public class Information extends AppCompatActivity{

    Button bt_306;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information);

        bt_306 = findViewById(R.id.button_close);
        bt_306.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


}

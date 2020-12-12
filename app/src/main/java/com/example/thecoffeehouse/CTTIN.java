package com.example.thecoffeehouse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.thecoffeehouse.Login.Login;
import com.example.thecoffeehouse.Login.SignIn_Activity;
import com.example.thecoffeehouse.Login.SignUp_Activity;
import com.example.thecoffeehouse.bottomNavigation.Tintuc;

public class CTTIN extends AppCompatActivity {
    ImageButton back_306;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ct_tin);
        back_306 = findViewById(R.id.btn_back_306);

        back_306.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CTTIN.this, Tintuc.class);
                startActivity(intent);

            }
        });

    }
}

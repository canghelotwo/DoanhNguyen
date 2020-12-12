package com.example.thecoffeehouse.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.thecoffeehouse.R;

public class SignUp_Activity extends AppCompatActivity {

    Button signup_306;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_);
        signup_306 = findViewById(R.id.bt_signup);
        signup_306.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignUp_Activity.this, "Sign up success", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(SignUp_Activity.this, SignIn_Activity.class);


            }
        });
    }
}
package com.example.thecoffeehouse.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.thecoffeehouse.MainActivity;
import com.example.thecoffeehouse.R;

public class SignIn_Activity extends AppCompatActivity {

    Button signin_306;
    EditText tk_306, mk_306;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_);

        tk_306=(EditText) findViewById(R.id.edtEmail);
        mk_306=(EditText) findViewById(R.id.edtPassword);
        signin_306=(Button) findViewById(R.id.btn_signin);
        signin_306.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ControlButton();
            }
        });
    }
    private void ControlButton() {
        if (tk_306.getText().length() != 0 && mk_306.getText().length() != 0) {
            if (tk_306.getText().toString().equals("nguyenvandoanh") && mk_306.getText().toString().equals("doanh123456")) {
                Toast.makeText(SignIn_Activity.this, "Bạn đã đăng nhập thành công", Toast.LENGTH_SHORT).show();

                //chuyen giua cac giao dien vói nhau
                Intent intent = new Intent(SignIn_Activity.this, MainActivity.class);
                startActivity(intent);

            } else {
                Toast.makeText(SignIn_Activity.this, "Bạn đã đăng nhập thất bại", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(SignIn_Activity.this, "Mời bạn nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
        }
    }
}
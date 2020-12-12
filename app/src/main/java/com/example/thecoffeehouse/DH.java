package com.example.thecoffeehouse;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.thecoffeehouse.Login.Login;
import com.example.thecoffeehouse.Login.SignIn_Activity;
import com.example.thecoffeehouse.Login.SignUp_Activity;
import com.example.thecoffeehouse.bottomNavigation.Dathang;

public class DH  extends AppCompatActivity {
    private Button cong_306,tru_306,ok_306;
    private TextView tv_306;
    private Integer count_306 = 1;
    private String val_306;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.dilg_dathang);

        cong_306 = (Button) findViewById(R.id.bt_cong_306);
        tru_306 = (Button) findViewById(R.id.bt_tru_306);
        ok_306 = (Button) findViewById(R.id.bt_ok_306);
        tv_306 =(TextView) findViewById(R.id.tvsl_306);

        cong_306.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count_306++;
                val_306 = Integer.toString(count_306);
                tv_306.setText(val_306);

            }
        });

        tru_306.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count_306--;
                val_306 = Integer.toString(count_306);
                tv_306.setText(val_306);


            }
        });
        ok_306.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DH.this, "Đặt Hàng Thành Công", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(DH.this, Dathang.class);
                startActivity(intent);
            }
        });

    }
}

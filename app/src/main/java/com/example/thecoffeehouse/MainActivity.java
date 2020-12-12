package com.example.thecoffeehouse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.thecoffeehouse.bottomNavigation.Cuahang;
import com.example.thecoffeehouse.bottomNavigation.Dathang;
import com.example.thecoffeehouse.bottomNavigation.Taikhoan;
import com.example.thecoffeehouse.bottomNavigation.Tintuc;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private ActionBar toolbar_306;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar_306 = getSupportActionBar();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        // load the store fragment by default
        loadFragment(new Tintuc());
    }

     private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment_306;
            switch (item.getItemId()) {
                case R.id.tintuc:
                    fragment_306 = new Tintuc();
                    loadFragment(fragment_306);
                    return true;
                case R.id.dathang:
                    fragment_306 = new Dathang();
                    loadFragment(fragment_306);
                    return true;
                case R.id.cuahang:
                    fragment_306 = new Cuahang();
                    loadFragment(fragment_306);
                    return true;
                case R.id.taikhoan:
                    fragment_306 = new Taikhoan();
                    loadFragment(fragment_306);
                    return true;
            }

            return false;
        }
    };
    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}

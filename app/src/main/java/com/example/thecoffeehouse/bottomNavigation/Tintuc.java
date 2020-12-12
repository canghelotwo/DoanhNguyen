package com.example.thecoffeehouse.bottomNavigation;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.thecoffeehouse.CTTIN;
import com.example.thecoffeehouse.Information;
import com.example.thecoffeehouse.Main_DH;
import com.example.thecoffeehouse.Notify;
import com.example.thecoffeehouse.R;

public class Tintuc extends Fragment implements View.OnClickListener {

    ImageView img1_306, img2_306;
    ImageButton td_306,dh_306,cp_306;
    Button ct_306;


    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View root = inflater.inflate(R.layout.fragment_navigation_tintuc, container, false);


        img1_306 = root.findViewById(R.id.imageNotify);
        img1_306.setOnClickListener(this);
        img2_306 = root.findViewById(R.id.imageAdd);
        img2_306.setOnClickListener(this);
        td_306 = root.findViewById(R.id.imageTichDiem);
        td_306.setOnClickListener(this);
        dh_306 = root.findViewById(R.id.imageDatHang);
        dh_306.setOnClickListener(this);
        cp_306 = root.findViewById(R.id.imageCoupon);
        cp_306.setOnClickListener(this);
        ct_306 = root.findViewById(R.id.btn_chitiet_306);
        ct_306.setOnClickListener(this);

        return root;
    }
    Fragment fragment;
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imageNotify) {
            Intent dsp = new Intent(Tintuc.this.getActivity(), Notify.class);
            startActivity(dsp);
        }
        if (v.getId() == R.id.imageAdd) {
            Intent dsp = new Intent(Tintuc.this.getActivity(), Information.class);
            startActivity(dsp);
        }
        if (v.getId() == R.id.imageTichDiem) {
            Toast.makeText(this.getActivity(), "Tích điểm", Toast.LENGTH_SHORT).show();
        }
        if (v.getId() == R.id.imageDatHang) {
            Toast.makeText(this.getActivity(), "Đặt hàng ", Toast.LENGTH_SHORT).show();
            Intent dsp = new Intent(Tintuc.this.getActivity(), Main_DH.class);
            startActivity(dsp);
        }
        if (v.getId() == R.id.imageCoupon) {
            Toast.makeText(this.getActivity(), "Coupon", Toast.LENGTH_SHORT).show();
        }
        if (v.getId() == R.id.btn_chitiet_306) {
            Intent intent = new Intent(Tintuc.this.getActivity(), CTTIN.class);
            startActivity(intent);
        }

    }
}
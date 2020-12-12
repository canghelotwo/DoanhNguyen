package com.example.thecoffeehouse.model_adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.thecoffeehouse.R;

public class SanPhamAdapter extends ArrayAdapter<DoUong> {
    Activity context_306;
    int resource_306;

    public SanPhamAdapter(@NonNull Activity context_306, int resource_306) {
        super(context_306, resource_306);
        this.context_306 = context_306;
        this.resource_306 = resource_306;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater_306 = this.context_306.getLayoutInflater();
        View customView_306 = inflater_306.inflate(this.resource_306, null);
        ImageView imghinh_306 = customView_306.findViewById(R.id.imghinh);
        TextView txtten_306 = customView_306.findViewById(R.id.txtten);
        TextView txtgia_306 = customView_306.findViewById(R.id.txtgia);

        DoUong sp_306 = getItem(position);
        imghinh_306.setImageResource(sp_306.getHinh());
        txtten_306.setText(sp_306.getTen());
        txtgia_306.setText(sp_306.getGia() + "đ");

        return customView_306;


    }
}
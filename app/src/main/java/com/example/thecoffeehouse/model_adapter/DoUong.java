package com.example.thecoffeehouse.model_adapter;

import android.widget.ImageView;

import java.io.Serializable;

public class DoUong implements Serializable {
    private int hinh_306;
    private String ten_306;
    private String gia_306;

    public int getHinh() {
        return hinh_306;
    }

    public ImageView setHinh(int hinh_306) {
        this.hinh_306 = hinh_306;
        return null;
    }

    public String getTen() {
        return ten_306;
    }

    public void setTen(String ten_306) {
        this.ten_306 = ten_306;
    }

    public String getGia() {
        return gia_306;
    }

    public void setGia(String gia_306) {
        this.gia_306 = gia_306;
    }

    public DoUong(int hinh_306, String ten_306, String gia_306) {
        this.hinh_306 = hinh_306;
        this.ten_306 = ten_306;
        this.gia_306 = gia_306;
    }

    public DoUong() {
    }
}

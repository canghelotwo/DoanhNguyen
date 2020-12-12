package com.example.thecoffeehouse.tablayout;

import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.thecoffeehouse.R;
import com.example.thecoffeehouse.model_adapter.DoUong;
import com.example.thecoffeehouse.model_adapter.SanPhamAdapter;

public class DoAnFragment extends Fragment {

    private GridView gvmon_306;
    private SanPhamAdapter spadt_306;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View r = inflater.inflate(R.layout.fragment_do_an, container, false);

        gvmon_306 = r.findViewById(R.id.gv_mon);
        spadt_306 = new SanPhamAdapter(DoAnFragment.this.getActivity(), R.layout.item);
        gvmon_306.setAdapter(spadt_306);
        registerForContextMenu(gvmon_306);
        fakeData();
        addEvents();
        return r;
    }
    private void fakeData() {
        spadt_306.add(new DoUong(R.drawable.maccasocola, "Macca Phủ Socola", "45.000"));
        spadt_306.add(new DoUong(R.drawable.mitsay, "Mít sấy", "20.000"));
        spadt_306.add(new DoUong(R.drawable.bonglantrungmuoi, "Bông lan trứng muối", "29.000"));
    }
    private void addEvents() {
        gvmon_306.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Dialog dialog = new Dialog(DoAnFragment.this.getActivity());
                dialog.setContentView(R.layout.dilg_dathang);
                dialog.show();
            }
        });
        gvmon_306.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Dialog dialog = new Dialog(DoAnFragment.this.getActivity());
                dialog.setContentView(R.layout.dhang);
                dialog.show();

                return true;
            }
        });
    }
}
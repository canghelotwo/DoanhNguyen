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

public class ThucUongFragment extends Fragment {

    private GridView gvmon_306;
    private SanPhamAdapter spadt_306;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View r_306 = inflater.inflate(R.layout.fragment_pho_bien, container, false);
        gvmon_306 = r_306.findViewById(R.id.gv_mon);
        spadt_306 = new SanPhamAdapter(ThucUongFragment.this.getActivity(), R.layout.item);
        gvmon_306.setAdapter(spadt_306);
        registerForContextMenu(gvmon_306);
        fakeData();
        addEvents();
        return r_306;
    }
    private void fakeData() {
        spadt_306.add(new DoUong(R.drawable.cafedenda, "Cà phê đen đá", "15.000"));
        spadt_306.add(new DoUong(R.drawable.caphesua, "Cà phê sữa đá", "17.000"));
        spadt_306.add(new DoUong(R.drawable.nuocepcam, "Nước ép cam", "20.000"));
        spadt_306.add(new DoUong(R.drawable.chanhday, "Nước ép chanh dây", "17.000"));
        spadt_306.add(new DoUong(R.drawable.bacxiu1, "Bạc xỉu", "15.000"));
        spadt_306.add(new DoUong(R.drawable.trasuaday, "Trà sữa dâu tây", "17.000"));
        spadt_306.add(new DoUong(R.drawable.tradao, "Trà đào", "20.000"));
        spadt_306.add(new DoUong(R.drawable.kemdau, "Kem dâu tươi", "15.000"));

    }

    private void addEvents() {
        gvmon_306.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Dialog dialog = new Dialog(ThucUongFragment.this.getActivity());
                dialog.setContentView(R.layout.dilg_dathang);
                dialog.show();
            }
        });
        gvmon_306.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Dialog dialog = new Dialog(ThucUongFragment.this.getActivity());
                dialog.setContentView(R.layout.dhang);
                dialog.show();

                return true;
            }
        });
    }
}
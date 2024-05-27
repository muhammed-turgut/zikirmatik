package com.random.zikirmatik.Kayitlar;

import android.database.Cursor;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.random.zikirmatik.R;
import com.random.zikirmatik.databinding.KayitlayoutBinding;

import java.util.ArrayList;


public class KayitlarFram extends Fragment {
    RecyclerView recyclerView;
    ArrayList<String> kayitAdi, kayitTarihi, kayit;
    DaataBaseHelper daataBaseHelperkayitlar;
    KayitlarAdapter kayitlarAdapter;
    KayitlayoutBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = KayitlayoutBinding.inflate(inflater, container, false);
        View rootView = binding.getRoot();

        daataBaseHelperkayitlar = new DaataBaseHelper(getContext());

        kayitAdi = new ArrayList<>();
        kayitTarihi = new ArrayList<>();
        kayit = new ArrayList<>();

        recyclerView = rootView.findViewById(R.id.recyclerViewKayitlar);
        if (recyclerView != null) {
            kayitlarAdapter = new KayitlarAdapter(getContext(), kayitAdi, kayitTarihi, kayit);
            recyclerView.setAdapter(kayitlarAdapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

            dispaldata();
        } else {
            Log.e("KayitlarFram", "RecyclerView is null");
        }

        return rootView;
    }

    private void dispaldata() {
        Cursor cursor = daataBaseHelperkayitlar.getdata();
        if (cursor.getCount() == 0) {
            Toast.makeText(getActivity(), "No Entry Exist", Toast.LENGTH_SHORT).show();
            Log.d("KayitlarFram", "No data in database");
        } else {
            while (cursor.moveToNext()) {
                kayitAdi.add(cursor.getString(0));  // 0. sütun
                kayitTarihi.add(cursor.getString(1));  // 1. sütun
                kayit.add(cursor.getString(2));  // 2. sütun
            }
            Log.d("KayitlarFram", "Data loaded: " + kayitAdi.size() + " entries");
        }
        kayitlarAdapter.notifyDataSetChanged();  // Verilerin değiştiğini bildir
    }

}

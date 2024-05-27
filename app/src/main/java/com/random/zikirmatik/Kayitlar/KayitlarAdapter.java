package com.random.zikirmatik.Kayitlar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.random.zikirmatik.R;

import java.util.ArrayList;

public class KayitlarAdapter extends RecyclerView.Adapter<KayitlarAdapter.KayitlarHolder> {

    private Context context;
    private  ArrayList kayitAdi,kayitTarihi,kayit;

    public KayitlarAdapter(Context context, ArrayList kayitAdi, ArrayList kayitTarihi, ArrayList kayit) {
        this.context = context;
        this.kayitAdi = kayitAdi;
        this.kayitTarihi = kayitTarihi;
        this.kayit = kayit;
    }

     @NonNull
    @Override
    public KayitlarHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.kayitlayout,parent,false);
        return new KayitlarHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull KayitlarHolder holder, int position) {

        holder.kayitAdi.setText(String.valueOf(position));
        holder.kayitTarihi.setText(String.valueOf(position));
        holder.kayit.setText(String.valueOf(position));
    }

    @Override
    public int getItemCount() {
        return kayitTarihi.size();
    }

    public class KayitlarHolder extends RecyclerView.ViewHolder {
        TextView kayitAdi,kayitTarihi,kayit;
        public KayitlarHolder(@NonNull View itemView) {
            super(itemView);

            kayitAdi=itemView.findViewById(R.id.TextkayitAdi);
            kayitTarihi=itemView.findViewById(R.id.TextkayitTarihi);
            kayit=itemView.findViewById(R.id.Textkayit);

        }
    }
}
package com.random.zikirmatik.Hisnulmuslim;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.random.zikirmatik.R;
import com.random.zikirmatik.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class LandMarkAdapter extends RecyclerView.Adapter<LandMarkAdapter.LandMarkHolder> {

    private ArrayList<LandMark> filteredList;

    public LandMarkAdapter(ArrayList<LandMark> landMarkArrayList) {
        this.filteredList = new ArrayList<>(landMarkArrayList);
    }

    @NonNull
    @Override
    public LandMarkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new LandMarkHolder(recyclerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull LandMarkHolder holder, int position) {
        holder.binding.recyclerViewTextView.setText(filteredList.get(position).listeName);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LandMark currentLandMark = filteredList.get(position);
                holder.binding.recyclerViewTextView.setText(currentLandMark.getListeName());
                LandMark selectedLandmark = filteredList.get(holder.getAdapterPosition());
                Fragment detaylarFragment = Detaylar.newInstance(selectedLandmark);
                FragmentTransaction transaction = ((FragmentActivity) holder.itemView.getContext()).getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.container, detaylarFragment);
                transaction.addToBackStack(null); // Geri tuşuna basıldığında önceki fragment'e dönmesini sağlar
                transaction.commit();
            }
        });
    }

    @Override
    public int getItemCount() {
        return filteredList.size();
    }

    public void filterList(ArrayList<LandMark> filteredList) {
        this.filteredList = filteredList;
        notifyDataSetChanged();
    }

    public class LandMarkHolder extends RecyclerView.ViewHolder {

        private RecyclerRowBinding binding;

        public LandMarkHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}

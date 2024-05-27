package com.random.zikirmatik.Hisnulmuslim;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.random.zikirmatik.databinding.FragmentDetaylarBinding;

public class Detaylar extends Fragment {

    private FragmentDetaylarBinding binding;

    private static final String ARG_LANDMARK = "landmark";

    public static Detaylar newInstance(LandMark landmark) {
        Detaylar fragment = new Detaylar();
        Bundle args = new Bundle();
        args.putSerializable(ARG_LANDMARK, landmark);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentDetaylarBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        Bundle args = getArguments();
        if (args != null) {
            LandMark selectedLanMark = (LandMark) args.getSerializable(ARG_LANDMARK);
            if (selectedLanMark != null) {
                binding.ListeAdi.setText(selectedLanMark.listeName);
                binding.listeicerikBir.setText(selectedLanMark.listeImageBir);
                binding.listeicerikIki.setText(selectedLanMark.listeImageIki);
            }
        }

        return view;
    }
}




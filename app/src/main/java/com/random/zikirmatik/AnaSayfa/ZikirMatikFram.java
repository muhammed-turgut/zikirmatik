package com.random.zikirmatik.AnaSayfa;

import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.random.zikirmatik.Kayitlar.DaataBaseHelper;
import com.random.zikirmatik.R;
import com.random.zikirmatik.databinding.DialogKayitBinding;
import com.random.zikirmatik.databinding.FragmentZikirmatBinding;

public class ZikirMatikFram extends Fragment {
    ImageView artir, kaydet, sifirla;
    TextView skor;
    Button dialogEvet;
    ImageView kaydetdialogEvet, dialogIptal,kapatDialog;
    Dialog dialogsifirla, dialogkaydet;

    EditText kayitTarihiEditText, kayitAdiEditText;

    DialogKayitBinding dialogKayitBinding;


    private int skorAyar = 0;
    DaataBaseHelper dataBaseHelper;
    private  FragmentZikirmatBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Fragment layoutunu şişirbinding = FragmentZikirmatBinding.inflate(inflater, container, false);
        binding = FragmentZikirmatBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        dataBaseHelper = new DaataBaseHelper(getContext());
        View rootView = binding.getRoot();
        // Görünümleri bul
        artir = rootView.findViewById(R.id.artir);
        kaydet = rootView.findViewById(R.id.kaydet);
        sifirla = rootView.findViewById(R.id.sifirla);
        skor = rootView.findViewById(R.id.skor);


        // Diyalog penceresini oluştur
        dialogsifirla = new Dialog(requireContext());
        dialogsifirla.setContentView(R.layout.dialog_sifirla);
        dialogsifirla.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialogsifirla.getWindow().setBackgroundDrawable(requireContext().getDrawable(R.drawable.custom_dialog_bg));
        dialogsifirla.setCancelable(false);

        dialogKayitBinding = DialogKayitBinding.inflate(inflater);
        dialogkaydet = new Dialog(requireContext());
        dialogkaydet.setContentView(dialogKayitBinding.getRoot());
        dialogkaydet.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialogkaydet.getWindow().setBackgroundDrawable(requireContext().getDrawable(R.drawable.custom_dialog_bg));
        dialogkaydet.setCancelable(true);

        // Dialog içindeki görünümleri bul
         dialogEvet = dialogsifirla.findViewById(R.id.dialogEvet);
        kapatDialog = dialogsifirla.findViewById(R.id.kapatDialog);

        kayitTarihiEditText=dialogkaydet.findViewById(R.id.kayitTarihi);
        kayitAdiEditText=dialogkaydet.findViewById(R.id.kayitAdi);
        dialogIptal=dialogkaydet.findViewById(R.id.iptaldialog);
        kaydetdialogEvet = dialogkaydet.findViewById(R.id.dialogEvet);





        // Kaydet dialogunu oluştur




        // Artırma işlemi
        artir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                skorAyar++;
                skor.setText(" " + skorAyar);
            }
        });

        // Kaydetme işlemi
        kaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogkaydet.show();

                kaydetdialogEvet.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String kayitTarihi = kayitTarihiEditText.getText().toString();
                        String kayitAdi = kayitAdiEditText.getText().toString();
                        String kayit=skor.getText().toString();

                        Boolean insert = dataBaseHelper.insertData(kayitTarihi, kayitAdi,kayit);
                        if (insert==true ) {
                            Toast.makeText(requireContext(), "Kayıt başarılı!", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(requireContext(), "Kayıt başarısız!", Toast.LENGTH_SHORT).show();
                        }
                        dialogkaydet.dismiss();
                    }
                });
            }
        });

        // Sıfırlama işlemi
        sifirla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogsifirla.show();
            }
        });

        // Sıfırlama dialog onay butonu
        dialogEvet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                skorAyar = 0;
                skor.setText("" + skorAyar);
                dialogsifirla.dismiss();
            }
        });

        // Sıfırlama dialog kapatma butonu
       kapatDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogsifirla.dismiss();
            }
        });

        // Kaydetme dialog onay butonu


        // Kaydetme dialog iptal butonu
        dialogIptal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogkaydet.dismiss();
            }
        });

        // Root görünümünü döndür
        return rootView;
    }

}
/*
public class ZikirMatikFram extends Fragment {
    // Diğer değişkenleriniz...

    private DialogKayitBinding dialogKayitBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Diğer kodlarınız...

        // Kaydet dialogunu oluştur
        dialogkaydet = new Dialog(requireContext());
        dialogKayitBinding = DialogKayitBinding.inflate(inflater, dialogkaydet.getContext(), false);
        dialogkaydet.setContentView(dialogKayitBinding.getRoot());
        dialogkaydet.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialogkaydet.getWindow().setBackgroundDrawable(requireContext().getDrawable(R.drawable.custom_dialog_bg));
        dialogkaydet.setCancelable(true);

        // Dialog içindeki görünümlere erişim
        EditText kayitTarihiEditText = dialogKayitBinding.kayitTarihi;
        EditText kayitAdiEditText = dialogKayitBinding.kayitAdi;
        ImageView kaydetdialogEvet = dialogKayitBinding.dialogEvet;
        ImageView dialogIptal = dialogKayitBinding.iptaldialog;

        // Diğer kodlarınız...
    }

    // Diğer metodlarınız...
}


@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

 */


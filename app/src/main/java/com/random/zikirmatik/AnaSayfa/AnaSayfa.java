package com.random.zikirmatik.AnaSayfa;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.random.zikirmatik.GorevlerFram;
import com.random.zikirmatik.Hisnulmuslim.HisnulMuslimFarm;
import com.random.zikirmatik.Kayitlar.KayitlarFram;
import com.random.zikirmatik.R;

public class AnaSayfa extends AppCompatActivity {

     BottomNavigationView bottomNavigationView;
     GorevlerFram gorevlerFram=new GorevlerFram();
     HisnulMuslimFarm hisnulMuslimFarm=new HisnulMuslimFarm();
     KayitlarFram kayitlarFram=new KayitlarFram();
     ZikirMatikFram zikirMatikFram=new ZikirMatikFram();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana_sayfa);

     bottomNavigationView=findViewById(R.id.bottomNavigationView);

     getSupportFragmentManager().beginTransaction().replace(R.id.container,zikirMatikFram).commit();
     bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
         @Override
         public boolean onNavigationItemSelected( MenuItem item) {
             switch (item.getItemId()) {

                 case R.id.zikirmatik:
                     getSupportFragmentManager().beginTransaction().replace(R.id.container, zikirMatikFram).commit();
                     return true;

                 case R.id.hisnulmuslim:
                     getSupportFragmentManager().beginTransaction().replace(R.id.container, hisnulMuslimFarm).commit();
                     return true;

                 case R.id.gorevler:
                     getSupportFragmentManager().beginTransaction().replace(R.id.container, gorevlerFram).commit();
                     return true;

                 case R.id.kayitlar:
                     getSupportFragmentManager().beginTransaction().replace(R.id.container, kayitlarFram).commit();
                     return true;
             }
             return false;
         }

     });

    }
}
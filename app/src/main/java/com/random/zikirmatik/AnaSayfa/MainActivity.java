package com.random.zikirmatik.AnaSayfa;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.random.zikirmatik.R;

public class MainActivity extends AppCompatActivity {



       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
           setContentView(R.layout.activity_main);





        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, AnaSayfa.class);
                startActivity(intent);
                finish();
            }
        },2000);

         Intent intent = new Intent(MainActivity.this,AnaSayfa.class);



    }
}
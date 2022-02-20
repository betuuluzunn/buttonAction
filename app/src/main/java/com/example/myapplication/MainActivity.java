package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;



public class MainActivity extends AppCompatActivity {

    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        next= findViewById(R.id.main_btn_next);

        //Butona tıklandığında

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Sayfa değiştirme
                Intent sayfaIki = new Intent (MainActivity.this, sayfaikiActivity2.class);
                startActivity(sayfaIki);

            }
        });
    }
}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class sayfaikiActivity2 extends AppCompatActivity {

    Button previous;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayfaiki2);
        previous= findViewById(R.id.sec_btn_prv);

        //Butona tıklandığında

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Sayfa değiştirme
                Intent sayfaBir= new Intent(sayfaikiActivity2.this,MainActivity.class);
                startActivity(sayfaBir);
            }
        });


    }
}
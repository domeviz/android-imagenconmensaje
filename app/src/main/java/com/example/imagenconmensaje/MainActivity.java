package com.example.imagenconmensaje;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Métodos para cada botón
    public void facebook(View view){
        Toast.makeText(this, "Facebook", Toast.LENGTH_SHORT).show();
    }

    public void instagram(View view){
        Toast.makeText(this, "Instagram", Toast.LENGTH_SHORT).show();
    }

    public void telegram(View view){
        Toast.makeText(this, "Telegram", Toast.LENGTH_SHORT).show();
    }

    public void whatsapp(View view){
        Toast.makeText(this, "WhatsApp", Toast.LENGTH_SHORT).show();
    }

    public void tiktok(View view){
        Toast.makeText(this, "Tik Tok", Toast.LENGTH_SHORT).show();
    }

    public void pinterest(View view){
        Toast.makeText(this, "Pinterest", Toast.LENGTH_SHORT).show();
    }
}
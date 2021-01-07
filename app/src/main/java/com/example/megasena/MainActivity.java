package com.example.megasena;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button botao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.botaop);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                botaoActivity();
            }
        });

    }

    private void botaoActivity() {

        startActivity(new Intent(MainActivity.this,Parte2.class));
    }
}
package com.example.megasena;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Parte2 extends AppCompatActivity {
    private EditText aposta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parte2);

        aposta = (EditText) findViewById(R.id.aposta01);

    }

    public void OnClickApostar(View view){
        int num  =  Integer.parseInt(aposta.getText().toString());

        Intent intentApostar = new Intent(getApplicationContext(), Parte3.class);
        Bundle paramet = new Bundle();

        paramet.putInt("aposta",num);

        intentApostar.putExtras(paramet);
        startActivity(intentApostar);
    }
}
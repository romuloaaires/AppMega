package com.example.megasena;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.ArraySet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Parte3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parte3);

        Intent intentApost = getIntent();
        Bundle paramet = intentApost.getExtras();
        ListView result = (ListView) findViewById(R.id.result);
        TextView titu = findViewById(R.id.titulo);
        TextView mensagem = findViewById(R.id.textView2);
        int valor = paramet.getInt("aposta");

        List<Integer> listavetor = new ArrayList<>();
        ArrayList lis = new ArrayList<>();
        ArrayList lis2 = new ArrayList<>();


     if (paramet != null){

         titu.setText("    SORTEANDO " + valor + " JOGOS ");

                     for (int i = 1; i <= 60; i++) listavetor.add(i);

                        for (int i = 1; i <= valor; i++) {
                            List<Integer> escolhidos =  listavetor.subList(0, 6);

                            Collections.shuffle(listavetor);
                            lis.add("           JOGO "+ i +" "+ escolhidos);

                            ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, lis);
                            result.setAdapter(adapter);

                        }

                         mensagem.setText( "  ACREDITA COLEGA !!! " );


     }


    }
    public void inicio(View view){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}
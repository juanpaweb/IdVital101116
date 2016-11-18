package com.example.andresrugeforero.idvital101116;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class perfiles extends AppCompatActivity {
    Button button12;
    Button button7;
    Button button8;
    Button button9;
    Button button11;
    Button button10;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfiles);
        button12 = (Button) findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent button12 = new Intent(perfiles.this, perfilAdulto.class);
                startActivity(button12);
            }
        });
        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent button7 = new Intent(perfiles.this, perfilDeportista.class);
                startActivity(button7);
            }
        });
        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent button8 = new Intent(perfiles.this, perfilTerceraEdad.class);
                startActivity(button8);
            }
        });
        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent button9 = new Intent(perfiles.this, perfilNinos.class);
                startActivity(button9);
            }
        });
        button11 = (Button) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent button11 = new Intent(perfiles.this, perfilMascotas.class);
                startActivity(button11);
            }
        });
        button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent button10 = new Intent(perfiles.this, perfilEmpresarial.class);
                startActivity(button10);
            }
        });


    }
}

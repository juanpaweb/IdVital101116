package com.example.andresrugeforero.idvital101116;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton nosotros;
    ImageButton qcode;
    ImageButton usuario;
    ImageButton tienda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.botonatras);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        setContentView(R.layout.inicio);


        qcode = (ImageButton) findViewById(R.id.qcode);
        qcode.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent qcode = new Intent(MainActivity.this,qcode.class);
                startActivity(qcode);
            }

        });


        usuario = (ImageButton) findViewById(R.id.usuario);
        usuario.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent usuario = new Intent(MainActivity.this,usuario.class);
                startActivity(usuario);
            }

        });

        nosotros = (ImageButton) findViewById(R.id.nosotros);
        nosotros.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent nosotros = new Intent(MainActivity.this,nosotros.class);
                startActivity(nosotros);
            }

        });
        tienda = (ImageButton) findViewById(R.id.tienda);
        tienda.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent tienda = new Intent(MainActivity.this,tienda.class);
                startActivity(tienda);
            }

        });

    }

}




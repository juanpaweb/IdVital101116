package com.example.andresrugeforero.idvital101116;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class usuario extends AppCompatActivity {
    Button planes;
    Button tipoPerfil;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);


        planes = (Button) findViewById(R.id.planes);
        planes.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent planes = new Intent(usuario.this,planes.class);
                startActivity(planes);
            }

        });

        tipoPerfil = (Button) findViewById(R.id.tipoPerfil);
        tipoPerfil.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent tipoPerfil = new Intent(usuario.this,perfiles.class);
                startActivity(tipoPerfil);
            }

        });


    }
}

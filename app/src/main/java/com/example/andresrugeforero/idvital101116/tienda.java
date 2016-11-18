package com.example.andresrugeforero.idvital101116;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class tienda extends AppCompatActivity {
    ImageButton imageButton3;
    ImageButton imageButton10;
    ImageButton imageButton4;
    ImageButton imageButton5;
    ImageButton imageButton8;
    TextView  textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tienda);

        imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        imageButton3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent imageButton3 = new Intent(tienda.this,planIdVital.class);
                startActivity(imageButton3);
            }

        });
        imageButton10 = (ImageButton) findViewById(R.id.imageButton10);
        imageButton10.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent imageButton10 = new Intent(tienda.this,PlanIdVitalBike.class);
                startActivity(imageButton10);
            }

        });
        imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent imageButton4 = new Intent(tienda.this,planIdVitalTravel.class);
                startActivity(imageButton4);
            }

        });
        imageButton5 = (ImageButton) findViewById(R.id.imageButton5);
        imageButton5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent imageButton5 = new Intent(tienda.this,planIdVitalKids.class);
                startActivity(imageButton5);
            }

        });

        imageButton8 = (ImageButton) findViewById(R.id.imageButton8);
        imageButton8.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent imageButton8 = new Intent(tienda.this,planIdVitalPet.class);
                startActivity(imageButton8);
            }

        });
        textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent textView3 = new Intent(tienda.this,planes.class);
                startActivity(textView3);
            }

        });
    }
}

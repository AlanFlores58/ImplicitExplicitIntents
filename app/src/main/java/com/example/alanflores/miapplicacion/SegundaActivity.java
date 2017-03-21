package com.example.alanflores.miapplicacion;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.content.Intent.ACTION_VIEW;

public class SegundaActivity extends AppCompatActivity {

    Button button1, button2, button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        button1 = (Button)  findViewById(R.id.button1);
        button2 = (Button)  findViewById(R.id.button2);
        button3 = (Button)  findViewById(R.id.button3);
        button4 = (Button)  findViewById(R.id.button4);

        button1.setOnClickListener(eventoBoton);
        button2.setOnClickListener(eventoBoton);
        button3.setOnClickListener(eventoBoton);
        button4.setOnClickListener(eventoBoton);

    }

    private View.OnClickListener eventoBoton = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(v == button1){
                Intent intent = new Intent(SegundaActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }else if(v == button2){
                Intent intent = new Intent(SegundaActivity.this,MainActivity.class);
                intent.putExtra("valor1","Este es un dato");
                intent.putExtra("valor2",1);
                startActivity(intent);
            }else if(v == button3){
                Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://omnius.com.mx"));
                startActivity(intent);
            }else if(v == button4){
                Intent intent = new Intent(ACTION_VIEW, Uri.parse("tel:33333333"));
                startActivity(intent);
            }

        }
    };
}

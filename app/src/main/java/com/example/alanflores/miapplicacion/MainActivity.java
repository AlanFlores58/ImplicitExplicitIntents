package com.example.alanflores.miapplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button miBoton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout miLinearLayout = new LinearLayout(this);
        miLinearLayout.setOrientation(LinearLayout.VERTICAL);


        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT);
        miLinearLayout.setLayoutParams(layoutParams2);
        setContentView(miLinearLayout);


        miBoton = new Button(this);
        miBoton.setText("Boton creado desde codigo");

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);

        miBoton.setLayoutParams(layoutParams);
        miBoton.setOnClickListener(eventoOnClick);


        miLinearLayout.addView(miBoton);



        /*Diseño de interfaz desde Xml
        setContentView(R.layout.activity_main);

        miBoton = (Button) findViewById(R.id.button);*/
    }

    private View.OnClickListener eventoOnClick = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            if(v == miBoton){
                Intent intent = new Intent(MainActivity.this,SegundaActivity.class);
                startActivity(intent);
                //mata la actividad en la que se llama el intent
                finish();
            }
        }
    };
}

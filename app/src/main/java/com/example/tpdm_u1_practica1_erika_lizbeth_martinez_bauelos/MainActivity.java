package com.example.tpdm_u1_practica1_erika_lizbeth_martinez_bauelos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton vale1,vale2;
    Button premio;
    TextView etiqueta;
    EditText nombre;

     String nombred="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        premio=(Button)findViewById(R.id.premio);
        vale1=(RadioButton)findViewById(R.id.vale1);
        vale2=(RadioButton)findViewById(R.id.vale2);
        etiqueta=(TextView)findViewById(R.id.etiqueta);
        nombre= (EditText)findViewById(R.id.Nombre);
        premio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                nombred=nombre.getText().toString();

                if(vale1.isChecked()){
                   etiqueta.setText("Vale por una cena"+" "+nombred);

                }
                else if(vale2.isChecked()) {
                    etiqueta.setText("Vale por chocolates"+" "+nombred);
                }else {

                etiqueta.setText("No se ha seleccionado ninguna opcion"+" "+nombred);
                }

               }//onclick

        });

    }
}

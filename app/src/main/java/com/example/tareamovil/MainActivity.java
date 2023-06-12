package com.example.tareamovil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button btnmostrar;
    EditText nombre, apellido, edad, correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   /* nombre = (EditText) findViewById(R.id.nombre);
    apellido = (EditText) findViewById(R.id.apellido);
    edad = (EditText) findViewById(R.id.edad);
    correo = (EditText) findViewById(R.id.correo);
    btnmostrar = (Button) findViewById(R.id.btnmostrar);

    btnmostrar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(),"Datos:"+" "+nombre.getText().toString()+ " " +apellido.getText().toString()+ " "+edad.getText().toString()+ " "+correo.getText().toString(), Toast.LENGTH_LONG).show();
        }
    });*/
    }
}
package com.example.tarea1operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText n1 = (EditText) findViewById(R.id.txtn1);
        EditText n2 = (EditText) findViewById(R.id.txtn2);

        //Suma
        Button suma = (Button) findViewById(R.id.btnSuma);
        txtR = (TextView) findViewById(R.id.txtR);
        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pantalla = new Intent(getApplicationContext(), MainActivity2.class);
                Operaciones funcion = new Operaciones(
                        Integer.parseInt(n1.getText().toString()),
                        Integer.parseInt(n2.getText().toString())
                );
                int resultado = funcion.suma(Integer.parseInt(n1.getText().toString()), Integer.parseInt(n2.getText().toString()));
                txtR.setText("La suma es: " + resultado);
                pantalla.putExtra("dato", txtR.getText().toString());
                startActivity(pantalla);
            }
        });
        //Resta
        Button resta = (Button) findViewById(R.id.btnResta);

        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pantalla = new Intent(getApplicationContext(), MainActivity2.class);
                Operaciones funcion = new Operaciones(
                        Integer.parseInt(n1.getText().toString()),
                        Integer.parseInt(n2.getText().toString())
                );
                int resultado = funcion.resta(Integer.parseInt(n1.getText().toString()), Integer.parseInt(n2.getText().toString()));
                txtR.setText("La Resta es: " + resultado);
                pantalla.putExtra("dato", txtR.getText().toString());
                startActivity(pantalla);
            }
        });
        //División
        Button division = (Button) findViewById(R.id.btnDivision);

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pantalla = new Intent(getApplicationContext(), MainActivity2.class);
                Operaciones funcion = new Operaciones(
                        Integer.parseInt(n1.getText().toString()),
                        Integer.parseInt(n2.getText().toString())
                );
                Integer resultado = funcion.division(Integer.parseInt(n1.getText().toString()), Integer.parseInt(n2.getText().toString()));
                txtR.setText("La División es: " + resultado);
                pantalla.putExtra("dato", txtR.getText().toString());
                startActivity(pantalla);
            }
        });
        //Multiplicación
        Button multiplicacion = (Button) findViewById(R.id.btnMultiplicacion);

        multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pantalla = new Intent(getApplicationContext(), MainActivity2.class);
                Operaciones funcion = new Operaciones(
                        Integer.parseInt(n1.getText().toString()),
                        Integer.parseInt(n2.getText().toString())
                );
                Integer resultado = funcion.multiplicacion(Integer.parseInt(n1.getText().toString()), Integer.parseInt(n2.getText().toString()));
                txtR.setText("La Multiplicación es: " + resultado);
                pantalla.putExtra("dato", txtR.getText().toString());
                startActivity(pantalla);
            }
        });
    }
}
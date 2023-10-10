package com.example.conversion20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.conversion20.Models.Celsius;
import com.example.conversion20.Models.Farenheit;
import com.example.conversion20.Models.Grado;
import com.example.conversion20.Models.Kelvin;

public class MainActivity2 extends AppCompatActivity {

    Button conv;
    TextView result;
    EditText edit;
    Spinner spinner1;
    Spinner spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Grado g = new Grado();
        Kelvin k = new Kelvin();
        Celsius c = new Celsius();
        Farenheit f= new Farenheit();

        result = findViewById(R.id.resultado);
        conv = findViewById(R.id.convertir);
        edit = findViewById(R.id.edit1);
        spinner1 = findViewById(R.id.spinner1);
        spinner2 = findViewById(R.id.spinner2);

        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.Grados1, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter2=ArrayAdapter.createFromResource(this, R.array.Grados2, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner1.setAdapter(adapter);
        spinner2.setAdapter(adapter2);


        conv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String valorIngresado = edit.getText().toString();
                Double valor= Double.parseDouble(valorIngresado);
                g.setValor(valor);
                String unidadOrigen = spinner1.getSelectedItem().toString();
                String unidadDestino = spinner2.getSelectedItem().toString();



                if (unidadOrigen.equals("Celsius") && unidadDestino.equals("Farenheit")) {

                    c.setValor(valor);
                    Double resultado = f.parse(c).getValor();
                    result.setText("Resultado = " + resultado);
                }

                if (unidadOrigen.equals("Celsius") && unidadDestino.equals("Kelvin")) {

                    c.setValor(valor);
                    Double resultado = k.parse(c).getValor();
                    result.setText("Resultado = " + resultado);
                }

                if (unidadOrigen.equals("Farenheit") && unidadDestino.equals("Celsius")) {

                    f.setValor(valor);
                    Double resultado = c.parse(f).getValor();
                    result.setText("Resultado = " + resultado);
                }

                if (unidadOrigen.equals("Farenheit") && unidadDestino.equals("Kelvin")) {

                    f.setValor(valor);
                    Double resultado = k.parse(f).getValor();
                    result.setText("Resultado = " + resultado);
                }

                if (unidadOrigen.equals("Kelvin") && unidadDestino.equals("Celsius")) {

                    k.setValor(valor);
                    Double resultado = c.parse(k).getValor();
                    result.setText("Resultado = " + resultado);
                }

                if (unidadOrigen.equals("Kelvin") && unidadDestino.equals("Farenheit")) {

                    k.setValor(valor);
                    Double resultado = f.parse(k).getValor();
                    result.setText("Resultado = " + resultado);
                }
            }
        });
    }
}
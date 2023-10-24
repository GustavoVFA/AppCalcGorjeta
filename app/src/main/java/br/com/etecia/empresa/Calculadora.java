package br.com.etecia.empresa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import kotlin.text.UStringsKt;

public class Calculadora extends AppCompatActivity {

    Button btnCalc;

    EditText valorGorjeta;
    EditText valorTotal;
    Spinner select;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        valorGorjeta = findViewById(R.id.editTextValorGorjeta);

        select = (Spinner) findViewById(R.id.valores_calc);

        valorTotal = findViewById(R.id.valorTotal);

        btnCalc = findViewById(R.id.btnCalc);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.valores_calc, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        select.setAdapter(adapter);


    }

}
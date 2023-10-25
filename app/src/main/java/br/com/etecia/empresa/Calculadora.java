package br.com.etecia.empresa;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Calculadora extends AppCompatActivity {

    EditText txtValorConta, txtValorGorjeta, txtValorTotal;
    Button btnCalcular;
    Spinner select;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        txtValorConta = findViewById(R.id.txtValorConta);
        txtValorGorjeta = findViewById(R.id.txtValorGorjeta);
        txtValorTotal = findViewById(R.id.txtValorTotal);
        btnCalcular = findViewById(R.id.btnCalcular);
        select = findViewById(R.id.valores_calc);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.valores_calc, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        select.setAdapter(adapter);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcularGorjeta();
            }
        });
    }

    private void calcularGorjeta() {
        double valorDaConta = Double.parseDouble(txtValorConta.getText().toString());
        double gorjeta = valorDaConta * 0.10; // 10% da conta como gorjeta
        double valorTotal = valorDaConta + gorjeta;

        // Atualize os campos de texto com os resultados
        txtValorGorjeta.setText(String.valueOf(gorjeta));
        txtValorTotal.setText(String.valueOf(valorTotal));
    }
}

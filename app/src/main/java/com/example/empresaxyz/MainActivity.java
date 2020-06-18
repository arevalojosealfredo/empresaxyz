package com.example.empresaxyz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText cantidad;
    private TextView valorPagar;
    private Spinner comboMaterial, comboDije, comboTipo, comboMoneda;
    private ArrayAdapter<String> adapterMaterial, adapterDije, AdapterTipo, AdapterMoneda;
    private String[] material, dije, tipo, moneda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cantidad = findViewById(R.id.txtCantidad);

    }
}

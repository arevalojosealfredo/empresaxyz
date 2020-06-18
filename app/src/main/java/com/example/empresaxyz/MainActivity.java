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
    private ArrayAdapter<String> adapterMaterial, adapterDije, adapterTipo, adapterMoneda;
    private String[] material, dije, tipo, moneda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cantidad = findViewById(R.id.txtCantidad);
        valorPagar = findViewById(R.id.lblValorPagar);
        comboMaterial = findViewById(R.id.cmbMaterial);
        comboDije = findViewById(R.id.cmbDije);
        comboTipo = findViewById(R.id.cmbTipo);
        comboMoneda = findViewById(R.id.cmbMoneda);

        material = getResources().getStringArray(R.array.material);
        dije = getResources().getStringArray(R.array.dije);
        tipo = getResources().getStringArray(R.array.tipo);
        moneda = getResources().getStringArray(R.array.moneda);

        adapterMaterial = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, material);
        comboMaterial.setAdapter(adapterMaterial);

        adapterDije = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, dije);
        comboDije.setAdapter(adapterDije);

        adapterTipo = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tipo);
        comboTipo.setAdapter(adapterTipo);

        adapterMoneda = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, moneda);
        comboMoneda.setAdapter(adapterMoneda);
    }

    

}

package com.example.empresaxyz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import static java.lang.Double.parseDouble;


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


    public boolean validar(){
        String error_cantidadcero, errorcantidadv;

        error_cantidadcero=getResources().getString(R.string.error_cantidadcero);
        errorcantidadv=getResources().getString(R.string.error_cantidadv);

        if(cantidad.getText().toString().isEmpty()){
            cantidad.setError(errorcantidadv);
            cantidad.requestFocus();
            return false;
        }else if (Double.parseDouble(cantidad.getText().toString())==0){
            cantidad.setError(error_cantidadcero);
            cantidad.requestFocus();
            return false;
        }
        return true;
    }


    public void calculoDePago(View v){
        int mat, dij, tip, mon, valuni;
        double can, pag=0;

        if(validar()){
            can = parseDouble(cantidad.getText().toString());
            mat = comboMaterial.getSelectedItemPosition();
            dij = comboDije.getSelectedItemPosition();
            tip = comboTipo.getSelectedItemPosition();
            mon = comboMoneda.getSelectedItemPosition();

            switch (mat){
                case 0:
                    switch (dij){
                        case 0:
                            switch (tip){
                                case 0:
                                    valuni=100;
                                    switch (mon){
                                        case 0:
                                            pag = valuni*can;
                                            break;
                                        case 1:
                                            pag = (valuni *can)*3200;
                                            break;
                                    }break;
                                case 1:
                                    valuni = 80;
                                    switch (mon){
                                        case 0:
                                            pag = valuni*can;
                                            break;
                                        case 1:
                                            pag = (valuni*can)*3200;
                                            break;
                                    }break;
                                case 2:
                                    valuni = 70;
                                    switch (mon){
                                        case 0:
                                            pag = valuni*can;
                                            break;
                                        case 1:
                                            pag = (valuni*can)*3200;
                                            break;
                                    }break;
                            }break;
                        case 1:
                            switch (tip){
                                case 0:
                                    valuni = 120;
                                    switch (mon){
                                        case 0:
                                            pag = valuni*can;
                                            break;
                                        case 1:
                                            pag = (valuni*can)*3200;
                                            break;
                                    }break;
                                case 1:
                                    valuni = 100;
                                    switch (mon) {
                                        case 0:
                                            pag = valuni * can;
                                            break;
                                        case 1:
                                            pag = (valuni * can) * 3200;
                                            break;
                                    }break;
                                case 2:
                                    valuni = 90;
                                    switch (mon){
                                        case 0:
                                            pag = valuni*can;
                                            break;
                                        case 1:
                                            pag = (valuni*can)*3200;
                                            break;
                                    }break;
                            }break;
                    }break;
                case 1:
                    switch (dij){
                        case 0:
                            switch (tip){
                                case 0:
                                    valuni = 90;
                                    switch (mon){
                                        case 0:
                                            pag = valuni*can;
                                            break;
                                        case 1:
                                            pag = (valuni*can)*3200;
                                            break;
                                    }break;
                                case 1:
                                    valuni = 70;
                                    switch (mon){
                                        case 0:
                                            pag = valuni*can;
                                            break;
                                        case 1:
                                            pag = (valuni*can)*3200;
                                            break;
                                    }break;
                                case 2:
                                    valuni = 50;
                                    switch (mon){
                                        case 0:
                                            pag = valuni*can;
                                            break;
                                        case 1:
                                            pag = (valuni*can)*3200;
                                            break;
                                    }break;
                            }break;
                        case 1:
                            switch (tip){
                                case 0:
                                    valuni = 110;
                                    switch (mon){
                                        case 0:
                                            pag = valuni*can;
                                            break;
                                        case 1:
                                            pag = (valuni*can)*3200;
                                            break;
                                    }break;
                                case 1:
                                    valuni = 90;
                                    switch (mon){
                                        case 0:
                                            pag = valuni*can;
                                            break;
                                        case 1:
                                            pag = (valuni*can)*3200;
                                            break;
                                    }break;
                                case 2:
                                    valuni = 80;
                                    switch (mon){
                                        case 0:
                                            pag = valuni*can;
                                            break;
                                        case 1:
                                            pag = (valuni*can)*3200;
                                            break;
                                    }break;
                            }break;
                    }break;
            }

            valorPagar.setText("" + pag);
        }
    }

}

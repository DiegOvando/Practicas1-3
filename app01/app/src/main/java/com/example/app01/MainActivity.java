package com.example.app01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnSaludar;
    private EditText txtNombre;
    private TextView lblSaludo;
    private Button btnClean;
    private Button btnClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSaludar = (Button) findViewById(R.id.btnSaludo);
        txtNombre = (EditText) findViewById(R.id.txtSaludo2);
        lblSaludo = (TextView) findViewById(R.id.lblSaludo);
        btnClean = (Button) findViewById(R.id.btnLimpiar);
        btnClose = (Button) findViewById(R.id.btnCerrar);

        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtNombre.getText().toString().matches("")){
                    Toast.makeText(MainActivity.this,"Favor ingresar un nombre",
                            Toast.LENGTH_SHORT).show();
                }
                else{
                    String txtSaludar = txtNombre.getText().toString();
                    lblSaludo.setText("Hola " + txtSaludar + ", ¿como estas? :D");
                }
            }
        });

        btnClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblSaludo.setText("");
                txtNombre.setText("");
            }
        });

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class compra extends AppCompatActivity {
    TextView tvNombre,tvApellido;
    Button btManzana,btPera,btRegresar,btComprar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compra);
        tvNombre = findViewById(R.id.tvNombre);
        tvApellido = findViewById(R.id.tvApellido);
        btManzana = findViewById(R.id.btManzana);
        btPera = findViewById(R.id.btPera);
        btRegresar = findViewById(R.id.btRegresar);
        btComprar = findViewById(R.id.btComprar);

        btComprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(compra.this, historial.class);
                startActivity(intent);
            }
        });

        btRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(compra.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btManzana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Manzana();
            }
        });
        btPera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Pera();
            }
        });
        btRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(compra.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }

    private void Pera() {
        Toast.makeText(this, "Has agregado una Pera a tu carro de compra", Toast.LENGTH_SHORT).show();
    }

    public void Manzana() {
        Toast.makeText(this, "Has agregado una Manzana a tu carro de compra", Toast.LENGTH_SHORT).show();
    }
}
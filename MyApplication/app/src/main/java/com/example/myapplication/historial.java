package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class historial extends AppCompatActivity {
    TextView tvCantidadPeras,tvCantidadManzanas,tvNombreCadena;
    Button btRegresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial);
        tvCantidadPeras=findViewById(R.id.tvCantidadPeras);
        tvCantidadManzanas=findViewById(R.id.tvCantidadManzanas);
        tvNombreCadena=findViewById(R.id.tvNombreCadena);
        btRegresar=findViewById(R.id.btRegresar);

        btRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(historial.this, compra.class);
                startActivity(intent);
            }
        });
    }
}
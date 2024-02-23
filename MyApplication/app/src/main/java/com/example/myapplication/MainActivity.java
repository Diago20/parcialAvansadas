package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etNombre,etApellido;
    Button btContinuar,btBorrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNombre=findViewById(R.id.etNombre);
        etApellido=findViewById(R.id.etApellido);
        btContinuar=findViewById(R.id.btContinuar);
        btBorrar=findViewById(R.id.btBorrar);

        btContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombre();
                Intent intent = new Intent(MainActivity.this, compra.class);
                startActivity(intent);
            }
        });
        btBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Borrar();
            }
        });


    }

    private void nombre() {
        if (etNombre.getText().toString().isEmpty()) {
            Toast.makeText(this, "Por favor ingresar el Nombre", Toast.LENGTH_SHORT).show();
        }else if(etApellido.getText().toString().isEmpty()){
            Toast.makeText(this, "Por favor ingresar el Apellido", Toast.LENGTH_SHORT).show();
        }
    }
    public void Borrar(){
        etNombre.setText("");
        etApellido.setText("");
    }
}
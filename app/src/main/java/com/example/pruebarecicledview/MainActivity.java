package com.example.pruebarecicledview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Persona>persona=new ArrayList<>();
    Button registrar,mostrar;
    EditText nombre,apellido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        registrar=findViewById(R.id.btnRegistrar);
        mostrar=findViewById(R.id.btnMostar);
        nombre=findViewById(R.id.txtNombre);
        apellido=findViewById(R.id.txtApellido);
    }
    public void Registrar(View v){
        Persona per=new Persona(nombre.getText().toString(),apellido.getText().toString());
        persona.add(per);
        nombre.setText("");
        apellido.setText("");
    }

    public void Mostrar(View v) {
        Intent it=new Intent(getApplicationContext(), RecicledView.class);
        it.putExtra("Cosa",(Serializable) persona);
        startActivity(it);
    }
}
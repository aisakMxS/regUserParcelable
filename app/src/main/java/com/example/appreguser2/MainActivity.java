package com.example.appreguser2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.appreguser2.databinding.ActivityDetalleBinding;
import com.example.appreguser2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnRegistrar.setOnClickListener(v -> {
               String nombre = binding.txtNombre.getText().toString();
               String contra = binding.txtContra.getText().toString();
               String repContra = binding.txtRepContra.getText().toString();


            if(!nombre.isEmpty() && !contra.isEmpty() && !repContra.isEmpty()){
                if(contra.length() >= 5){
                    if(repContra.equals(contra)) {
                        abrirActivityDetalle(nombre, contra, repContra);
                    }else {
                        Context context = MainActivity.this;
                        CharSequence text = "Las contraseñas no coinciden!!";
                        int duration = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                }else{
                    Context context = MainActivity.this;
                    CharSequence text = "La contraseña debe tener min 5 caracteres!!";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }else{
                Context context = MainActivity.this;
                CharSequence text = "Existen campos vacíos!!";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
    }

    

    private void abrirActivityDetalle(String nom, String contra, String repContra){
        Intent intent = new Intent(this, DetalleActivity.class);
        Usuarios user = new Usuarios(nom, contra, repContra);
        intent.putExtra(DetalleActivity.USUARIO_KEY, user);
        startActivity(intent);
    }
}
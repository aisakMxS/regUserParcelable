package com.example.appreguser2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.appreguser2.databinding.ActivityDetalleBinding;

public class DetalleActivity extends AppCompatActivity {

    public static final String USUARIO_KEY = "usuario";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDetalleBinding binding = ActivityDetalleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Bundle extras = getIntent().getExtras();
        Usuarios user = extras.getParcelable(USUARIO_KEY);

        binding.setUsuarios(user);
    }
}
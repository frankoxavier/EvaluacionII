package com.abi.evaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    TextView tvTitulo;
    TextView tvFecha;
    ImageView ivAlitas;
    ImageView ivInternet;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*tvTitulo = findViewById(R.id.tvTitulo);
        tvTitulo.setText("Evaluación Moviles");
        tvFecha = findViewById(R.id.tvFecha);
        tvFecha.setText("03 de Noviembre del 2022");*/

        ivInternet = findViewById(R.id.ivInternet);

        ivAlitas = findViewById(R.id.ivAlitas);
        Glide.with(this).load("https://formaselectricas.com/wp-content/uploads/2022/02/caja-de-inspeccion-plastica-40x40-1.png").into(ivInternet);

    }
}
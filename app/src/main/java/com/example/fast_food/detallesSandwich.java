package com.example.fast_food;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class detallesSandwich extends AppCompatActivity {
    LinearLayout contenedor;
    String nombre_sandwich, precio_sandwich, descripcion_sandwich;
    TextView txVnombre_sand, txVprecio_sand, txVdescripcion_sand;
    Integer imagen_sandwiches;
    ImageView imagensandwichID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);


        ActionBar actionBar= getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        contenedor= (LinearLayout) findViewById(R.id.contenedor);
        Intent intent=getIntent();
        nombre_sandwich = intent.getStringExtra("nombre_sandwich");
        precio_sandwich= intent.getStringExtra("precio_sandwich");
        descripcion_sandwich= intent.getStringExtra("descripcion_sandwich");
        imagen_sandwiches= intent.getIntExtra("imagen_sandwich",R.id.imagenSandwiches);

        //Cambio de titulo del activity
        this.setTitle("Detalle Sandwich "+nombre_sandwich);

        txVnombre_sand= findViewById(R.id.textVnombre_sandwich);
        txVprecio_sand= findViewById(R.id.textVprecio_sandwich);
        txVdescripcion_sand= findViewById(R.id.textVdescripcion_sandwich);
        imagensandwichID= findViewById(R.id.imagenSandwiches);

        txVnombre_sand.setText(nombre_sandwich);
        txVprecio_sand.setText("$"+precio_sandwich);
        txVdescripcion_sand.setText(descripcion_sandwich);
        imagensandwichID.setImageResource(imagen_sandwiches);



    }
}

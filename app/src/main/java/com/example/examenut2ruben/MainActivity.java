package com.example.examenut2ruben;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu2) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu2);
        return true;
    }


   public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Toast toast = Toast.makeText(this,"A SUMAR Y RESTAR", Toast.LENGTH_SHORT);
                toast.show();
                Intent intent = new Intent(this, SumarRestar.class);
                startActivityForResult(intent, 0);
                return true;
            case R.id.item2:
                Toast toast2 = Toast.makeText(this,"A BASE DE DATOS", Toast.LENGTH_SHORT);
                toast2.show();
                Intent intent2 = new Intent(this, BaseDatos.class);
                startActivityForResult(intent2, 0);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button bta1 = findViewById(R.id.btn1);
        Button bta2 = findViewById(R.id.btn2);

        bta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SumarRestar.class);
                startActivityForResult(intent, 0);
            }
        });

        bta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), BaseDatos.class);
                startActivityForResult(intent, 0);
            }
        });


    }
}
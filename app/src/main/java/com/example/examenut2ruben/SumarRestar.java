package com.example.examenut2ruben;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SumarRestar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumar_restar);
        Button btn1 = findViewById(R.id.btnr1);
        Button btn2 = findViewById(R.id.btnr2);
        Button btn3 = findViewById(R.id.btnr3);
        Button btn4 = findViewById(R.id.btnr4);
        Button btn5 = findViewById(R.id.btnr5);
        TextView txtfinal = findViewById(R.id.txtrresultado);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtfinal.setText("0");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.valueOf(txtfinal.getText().toString())+1;
                txtfinal.setText(String.valueOf(num));
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.valueOf(txtfinal.getText().toString())-1;
                txtfinal.setText(String.valueOf(num));
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.valueOf(txtfinal.getText().toString())+2;
                txtfinal.setText(String.valueOf(num));
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.valueOf(txtfinal.getText().toString())-2;
                txtfinal.setText(String.valueOf(num));
            }
        });



    }
}
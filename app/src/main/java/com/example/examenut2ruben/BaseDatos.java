package com.example.examenut2ruben;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BaseDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_datos);
        EditText et1 = findViewById(R.id.etxt1);
        EditText et2 = findViewById(R.id.etxt2);
        EditText et3 = findViewById(R.id.etxt3);
        EditText et4 = findViewById(R.id.etxt4);
        Button btn1 = findViewById(R.id.btninsertar);

        Helper helper = new Helper(this,"bdGruposMusicales.db",1);
        SQLiteDatabase db = helper.getWritableDatabase();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContentValues values = new ContentValues();
                int num=1;

                if (!et1.getText().toString().isEmpty()){
                    values.put("nombre",et1.getText().toString());
                    num = num+1;
                }
                if(!et2.getText().toString().isEmpty()){
                    values.put("nacionalidad",et2.getText().toString());
                    num = num+1;
                }
                if(!et3.getText().toString().isEmpty()){
                    values.put("genero_musical",et3.getText().toString());
                    num = num+1;
                }
                if(!et4.getText().toString().isEmpty()){
                    values.put("year_creacion",et4.getText().toString());
                    num = num+1;
                }
                if (num==5){
                    Toast toast = Toast.makeText(v.getContext(),"REGISTRO INSERTADO", Toast.LENGTH_SHORT);
                    toast.show();
                    db.insert("grupos",null,values);
                }else{
                    Toast toast = Toast.makeText(v.getContext(),"NO SE HA PODIDO INSERTAR", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });



    }
}

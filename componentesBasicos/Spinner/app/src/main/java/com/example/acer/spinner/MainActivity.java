package com.example.acer.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
  Spinner spinner;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //enlazar los objetos por medio de su ID

        spinner=(Spinner)findViewById(R.id.spinner);
        btn=(Button)findViewById(R.id.btn);

        //creando la lista de los datos del Spinner
        //debido a que no estoy usando base de datos

        List<String>lista=new ArrayList<String>();
        lista.add("c++");
        lista.add("java");
        lista.add("c");
        lista.add("ruby");

        ArrayAdapter<String>ArrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,lista);



        spinner.setAdapter(ArrayAdapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                String op=spinner.getSelectedItem().toString();

                Toast.makeText(getApplicationContext(),op,Toast.LENGTH_SHORT).show();
            }
        });

    }
}

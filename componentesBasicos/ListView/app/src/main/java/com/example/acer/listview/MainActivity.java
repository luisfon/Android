package com.example.acer.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{

    ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista=(ListView)findViewById(R.id.lista);

        List<String>list=new ArrayList<String>();
        list.add("lunes");
        list.add("martes");
        list.add("miercoles");
        list.add("jueves");
        list.add("lunes");
        list.add("martes");
        list.add("miercoles");
        list.add("jueves");
        list.add("lunes");
        list.add("martes");
        list.add("miercoles");
        list.add("jueves");

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);

        lista.setAdapter(adapter);
    }
}

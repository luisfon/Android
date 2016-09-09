package com.example.acer.checkradio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    RadioGroup rg;
    Button btn;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg=(RadioGroup)findViewById(R.id.rg);
        btn=(Button)findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

           String opcion=((RadioButton)findViewById(rg.getCheckedRadioButtonId())).getText().toString();

                Toast.makeText(getApplicationContext(),opcion,Toast.LENGTH_SHORT).show();
            }
        });



    }
}

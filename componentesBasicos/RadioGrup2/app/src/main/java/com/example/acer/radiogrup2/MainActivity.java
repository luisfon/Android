package com.example.acer.radiogrup2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
  RadioGroup rg;
    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       rg=(RadioGroup)findViewById(R.id.rg);
        txt1=(TextView)findViewById(R.id.txt1);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {


                if(checkedId==R.id.paypal)
                {
                txt1.setText("PAYPAL");
                }
                else if(checkedId==R.id.dep)
                {
                    txt1.setText("DEPOSITO BANCARIO");
                }

            }
        });

    }



}

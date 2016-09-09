package practica.com.editapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
   //declarando componentes
    Button btn1;
    TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creando el vinculo de los componentes java con xml
        btn1=(Button) findViewById(R.id.btn1);

        text1=(TextView) findViewById(R.id.text1);

        //creamos el escuchador del boton
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                String nombre="luis";

                //cambia el contenido del TextView al pulsar el boton
                text1.setText(nombre);



            }
        });

    }
}

package com.umariana.sistemas.notascal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText t1;
    private EditText t2;
    private EditText t3;
    private TextView r1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=(EditText)findViewById(R.id.t1);
        t2=(EditText)findViewById(R.id.t2);
        t3=(EditText)findViewById(R.id.t3);
        r1=(TextView)findViewById(R.id.r1);


    }
    public void CalcularNotas(View view){

        double Pro=0;
        String Mensajes;
        int n1=Integer.parseInt(valor2);
        int n2=Integer.parseInt(valor2);
        int n3=Integer.parseInt(valor2);
        if (0<=n1&&n1<=20 && 0<=n2&&n2<=20 && 0<=n3&&n3<=20){
            pro=(n1+n2+n3)/3;
            if (pro<10.5) Mensajes="Desaprobado";
            else Mensajes="Aprobado";
        }
        else
            Mensajes="erron.los datos son incompletos";
    }
}

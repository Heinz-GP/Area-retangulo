package com.example.atvavaliativa2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextInputEditText bRet;
    private TextInputEditText hRet;
    private TextView res;

    private Button btn_calcular;
    private Button btn_limpar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bRet = findViewById(R.id.bRet);
        hRet = findViewById(R.id.hRet);
        res = findViewById(R.id.res);
        btn_calcular = findViewById(R.id.btn_calcular);
        btn_limpar = findViewById(R.id.btn_limpar);

        btn_calcular.setOnClickListener(this);
        btn_limpar.setOnClickListener(this);
    }




    public void calcular(){
        float base = Float.valueOf(bRet.getText().toString());
        float altura = Float.valueOf(hRet.getText().toString());
        float resultado = base * altura;
        String aux =Float.toString(resultado);
        res.setText(aux);
    }

    public void limpar(){
        bRet.setText("");
        hRet.setText("");
        res.setText("");
    }


    @Override
    public void onClick(View view) {
        if(view == btn_calcular){
            calcular();
        }else if(view ==btn_limpar){
            limpar();
        }
    }
}
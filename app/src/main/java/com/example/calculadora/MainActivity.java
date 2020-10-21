package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edt_numero1 = null;
    EditText edt_numero2 = null;
    TextView txt_resultado = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_numero1 = findViewById(R.id.edt_numero1);
        edt_numero2 = findViewById(R.id.edt_numero2);
        txt_resultado = findViewById(R.id.texto_resultado);
    }

    public void calcular(View v){
        double numero1 = 0;
        try {
            String textoNumero1 = edt_numero1.getText().toString();
            numero1 = Double.valueOf(textoNumero1);
        }
        catch (Exception e) {
            edt_numero1.setError("numero1 incorrecto");
            return;
        }
        //---------------------------------------------------------
        double numero2 = 0;
        try {
            String textoNumero2 = edt_numero2.getText().toString();
            numero2 = Double.valueOf(textoNumero2);
        }
        catch (Exception e) {
            edt_numero2.setError("numero2 incorrecto");
            return;
        }
        double resultado = 0.0;
        switch (v.getId())
        {
            case R.id.btn_mas:
                resultado = numero1 + numero2;
                break;
            case R.id.btn_menos:
                resultado = numero1 - numero2;
                break;
            case R.id.btn_multiplicar:
                resultado = numero1 * numero2;
                break;
            case R.id.btn_dividir:
                if(numero2 == 0) {
                    edt_numero2.setError("numero2 no puede ser cero");
                    return;
                }
                resultado = numero1 / numero2;
                break;
            case R.id.btn_resto:
                resultado = numero1 % numero2;
                break;
            default:
                break;
        }
        //---------------------------------------------------------
        double resultadoRedondeado = Math.round(resultado * 100.0)/ 100.0;
        //---------------------------------------------------------------
        txt_resultado.setText(String.valueOf(resultadoRedondeado));
    }
/*
    public void dividir(View view) {
        double numero1=0;
        try {
            String textonum1 = edt_numero1.getText().toString();
            numero1 = Double.valueOf(textonum1);

        }catch (Exception e){
            edt_numero1.setError("Numero Incorrecto");
            return;
        }

        double numero2=0;
        try {
            String textonum2 = edt_numero2.getText().toString();
            numero2 = Double.valueOf(textonum2);

        }catch (Exception e){
            edt_numero2.setError("Numero Incorrecto");
            return;
        }
        if (numero2 == 0){
            edt_numero2.setError("el numero no puede ser 0");
            return;
        }

        double resultado= numero1 / numero2;

        double resultadoRedondeado = Math.round(resultado * 100.0)/100.0;
        txt_resultado.setText(String.valueOf(resultadoRedondeado));
    }

    public void resto(View view) {
        double numero1=0;
        try {
            String textonum1 = edt_numero1.getText().toString();
            numero1 = Double.valueOf(textonum1);

        }catch (Exception e){
            edt_numero1.setError("Numero Incorrecto");
            return;
        }

        double numero2=0;
        try {
            String textonum2 = edt_numero2.getText().toString();
            numero2 = Double.valueOf(textonum2);

        }catch (Exception e){
            edt_numero2.setError("Numero Incorrecto");
            return;
        }

        double resultado= numero1 % numero2;

        double resultadoRedondeado = Math.round(resultado * 100.0)/100.0;
        txt_resultado.setText(String.valueOf(resultadoRedondeado));
    }

    public void multiplicar(View view) {
        double numero1=0;
        try {
            String textonum1 = edt_numero1.getText().toString();
            numero1 = Double.valueOf(textonum1);

        }catch (Exception e){
            edt_numero1.setError("Numero Incorrecto");
            return;
        }

        double numero2=0;
        try {
            String textonum2 = edt_numero2.getText().toString();
            numero2 = Double.valueOf(textonum2);

        }catch (Exception e){
            edt_numero2.setError("Numero Incorrecto");
            return;
        }

        double resultado= numero1 * numero2;

        double resultadoRedondeado = Math.round(resultado * 100.0)/100.0;
        txt_resultado.setText(String.valueOf(resultadoRedondeado));
    }

    public void menos(View view) {
        double numero1=0;
        try {
            String textonum1 = edt_numero1.getText().toString();
            numero1 = Double.valueOf(textonum1);

        }catch (Exception e){
            edt_numero1.setError("Numero Incorrecto");
            return;
        }

        double numero2=0;
        try {
            String textonum2 = edt_numero2.getText().toString();
            numero2 = Double.valueOf(textonum2);

        }catch (Exception e){
            edt_numero2.setError("Numero Incorrecto");
            return;
        }

        double resultado= numero1 - numero2;

        double resultadoRedondeado = Math.round(resultado * 100.0)/100.0;
        txt_resultado.setText(String.valueOf(resultadoRedondeado));
    }

    public void sumar(View view) {
        double numero1=0;
        try {
            String textonum1 = edt_numero1.getText().toString();
            numero1 = Double.valueOf(textonum1);

        }catch (Exception e){
            edt_numero1.setError("Numero Incorrecto");
            return;
        }

        double numero2=0;
        try {
            String textonum2 = edt_numero2.getText().toString();
            numero2 = Double.valueOf(textonum2);

        }catch (Exception e){
            edt_numero2.setError("Numero Incorrecto");
            return;
        }

            double resultado= numero1 + numero2;

            double resultadoRedondeado = Math.round(resultado * 100.0)/100.0;
            txt_resultado.setText(String.valueOf(resultadoRedondeado));
    }*/
}
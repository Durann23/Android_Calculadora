package com.example.practica2eventos;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private TextView inputTextView;
    private double firstNumber = 0;
    private String operator = "";
    private boolean isOperatorClicked = false;

    String currentText;
    int id;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Debes establecer el contenido primero
        inputTextView = findViewById(R.id.inputTextView);

        Button num00 = findViewById(R.id.num00);
        Button num0 = findViewById(R.id.num0);
        Button num1 = findViewById(R.id.num1);
        Button num2 = findViewById(R.id.num2);
        Button num3 = findViewById(R.id.num3);
        Button num4 = findViewById(R.id.num4);
        Button num5 = findViewById(R.id.num5);
        Button num6 = findViewById(R.id.num6);
        Button num7 = findViewById(R.id.num7);
        Button num8 = findViewById(R.id.num8);
        Button num9 = findViewById(R.id.num9);

        num00.setOnClickListener(this);
        num0.setOnClickListener(this);
        num1.setOnClickListener(this);
        num2.setOnClickListener(this);
        num3.setOnClickListener(this);
        num4.setOnClickListener(this);
        num5.setOnClickListener(this);
        num6.setOnClickListener(this);
        num7.setOnClickListener(this);
        num8.setOnClickListener(this);
        num9.setOnClickListener(this);

        Button punto = findViewById(R.id.punto);
        Button del = findViewById(R.id.del);
        Button porce = findViewById(R.id.porce);
        Button borrar = findViewById(R.id.borrar);
        Button div = findViewById(R.id.div);
        Button mult = findViewById(R.id.mult);
        Button menos = findViewById(R.id.menos);
        Button mas = findViewById(R.id.mas);
        Button igual = findViewById(R.id.igual);



        punto.setOnClickListener(this);
        porce.setOnClickListener(this);
        del.setOnClickListener(this);
        borrar.setOnClickListener(this);
        div.setOnClickListener(this);
        mult.setOnClickListener(this);
        menos.setOnClickListener(this);
        mas.setOnClickListener(this);
        igual.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        currentText=inputTextView.getText().toString();
        id = view.getId();

        if (id == R.id.num00) {
            if(currentText==""){

                currentText += "0";
            }
            else if(currentText.equals( "0")){
                currentText = "0";
            }
            else{
                currentText += "00";
            }
        } else if (id == R.id.num0) {
            currentText += "0";
        } else if (id == R.id.num1) {
            if(currentText.equals("0")){
                currentText="";
            }
            currentText += "1";
        } else if (id == R.id.num2) {
            if(currentText.equals("0")){
                currentText="";
            }
            currentText += "2";
        } else if (id == R.id.num3) {
            if(currentText.equals("0")){
                currentText="";
            }
            currentText += "3";
        } else if (id == R.id.num4) {
            if(currentText.equals("0")){
                currentText="";
            }
            currentText += "4";
        } else if (id == R.id.num5) {
            if(currentText.equals("0")){
                currentText="";
            }
            currentText += "5";
        } else if (id == R.id.num6) {
            if(currentText.equals("0")){
                currentText="";
            }
            currentText += "6";
        } else if (id == R.id.num7) {
            if(currentText.equals("0")){
                currentText="";
            }
            currentText += "7";
        } else if (id == R.id.num8) {
            if(currentText.equals("0")){
                currentText="";
            }
            currentText += "8";
        } else if (id == R.id.num9) {
            if(currentText.equals("0")){
                currentText="";
            }
            currentText += "9";
        }
        else if (id == R.id.mas) {
            if(currentText.equals("0")){
                currentText="";
            }
            currentText += "+";
        }
        else if (id == R.id.menos) {
            if(currentText.equals("0")){
                currentText="";
            }
            currentText += "-";
        }
        else if (id == R.id.mult) {
            if(currentText.equals("0")){
                currentText="";
            }
            currentText += "x";
        }
        else if (id == R.id.div) {
            if(currentText.equals("0")){
                currentText="";
            }
            currentText += "/";
        }

        inputTextView.setText(currentText);


        if (id == R.id.igual) {

            if (isOperatorClicked && !currentText.isEmpty()) {

                Expression expression = new ExpressionBuilder(currentText).build();

                try {
                    // Evaluar la expresión y obtener el resultado
                    double result = expression.evaluate();

                    // Mostrar el resultado
                    inputTextView.setText(String.valueOf(result));
                } catch (ArithmeticException e) {
                    // Manejar errores, como división por cero
                    inputTextView.setText("Error en la expresión");
                }

            }


        }

    }
        };



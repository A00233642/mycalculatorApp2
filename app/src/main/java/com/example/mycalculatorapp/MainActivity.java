package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Float.*;

public class MainActivity extends AppCompatActivity {

    //setting TextView
    TextView editinput;
    TextView displayinput;

    //declaring variables

    double firstinput = 0;
    double secondinput = 0;

    //declaring mathematical operators as boolean
    boolean Addition, Subtraction, Multiplication, Division, decimal;

    //declare buttons
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
            btnAdd, btnequal, btnminus, btnmultiply, btndot, btndivide, btnclear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //finding all the views by ids

        editinput = findViewById(R.id.input);
        displayinput = findViewById(R.id.result);

        Button btn0 = findViewById(R.id.btn0);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);
        Button btnAdd = findViewById(R.id.btnadd);
        Button btnMinus = findViewById(R.id.btnminus);
        Button btnMultiply = findViewById(R.id.btnmutiply);
        Button btnDivide = findViewById(R.id.btndivide);
        Button btnEqual = findViewById(R.id.btnequal);
        Button btnDot = findViewById(R.id.btndot);
        Button btnClear = findViewById(R.id.btnclear);



    }

    //setting the onClick listeners for Btn1
    @SuppressLint("SetTextI18n")
    public void Btn1(View view) {
        editinput.setText(editinput.getText() + "1");

    }
    //setting the onClick listeners for Btn2
    @SuppressLint("SetTextI18n")
    public void Btn2(View view) {
        editinput.setText(editinput.getText() + "2");
    }
    //setting the onClick listeners for Btn3
    @SuppressLint("SetTextI18n")
    public void Btn3(View view) {
        editinput.setText(editinput.getText() + "3");
    }
    //setting the onClick listeners for Btn4
    @SuppressLint("SetTextI18n")
    public void Btn4(View view) {
        editinput.setText(editinput.getText() + "4");
    }
    //setting the onClick listeners for Btn5
    @SuppressLint("SetTextI18n")
    public void Btn5(View view) {
        editinput.setText(editinput.getText() + "5");
    }
    //setting the onClick listeners for Btn6
    @SuppressLint("SetTextI18n")
    public void Btn6(View view) {
        editinput.setText(editinput.getText() + "6");
    }
    //setting the onClick listeners for Btn7
    @SuppressLint("SetTextI18n")
    public void Btn7(View view) {
        editinput.setText(editinput.getText() + "7");
    }
    //setting the onClick listeners for Btn8
    @SuppressLint("SetTextI18n")
    public void Btn8(View view) {
        editinput.setText(editinput.getText() + "8");
    }
    //setting the onClick listeners for Btn9
    @SuppressLint("SetTextI18n")
    public void Btn9(View view) {
        editinput.setText(editinput.getText() + "9");
    }
    //setting the onClick listeners for Btn0
    @SuppressLint("SetTextI18n")
    public void Btn0(View view) {
        editinput.setText(editinput.getText() + "0");

    }
    //setting the onClick listeners for BtnClear
    public void Btnclear(View view) {
        editinput.setText("");
        displayinput.setText("");

    }
    //setting the onClick listeners for BtnDot
    @SuppressLint("SetTextI18n")
    public void BtnDot(View view) {
        editinput.setText(editinput.getText() + ".");

    }

    //setting the onClick listeners for Btnadd
    public void Btnadd(View view) {
        if (editinput.getText().length() != 0) {
            firstinput = parseFloat(editinput.getText() + "");
            editinput.setText("+");
            Addition = true;
            decimal = false;
            editinput.setText(null);

        }

    }

    //setting the onClick listeners for Btnminus
    @SuppressLint("SetTextI18n")
    public void Btnminus(View view) {
        if (editinput.getText().length() != 0) {
            firstinput = parseFloat(editinput.getText() + "");
            editinput.setText("-");
            Subtraction = true;
            decimal = false;
            editinput.setText(null);
        }
    }

    //setting the onClick listeners for Btnmultiply
    @SuppressLint("SetTextI18n")
    public void Btnmultiply(View view) {
        if (editinput.getText().length() != 0) {
            firstinput = parseFloat(editinput.getText() + "");
            editinput.setText("*");
            Multiplication = true;
            decimal = false;
            editinput.setText(null);
        }
    }

    //setting the onClick listeners for BtnDivide
    @SuppressLint("SetTextI18n")
    public void BtnDivide(View view) {
        if (editinput.getText().length() != 0) {
            firstinput = parseFloat(editinput.getText() + "");
            editinput.setText("/");
            Division = true;
            decimal = false;
            editinput.setText(null);
        }
    }

    //setting the onClick listeners for Btnequal
    @SuppressLint("SetTextI18n")
    public void Btnequal(View view) {
        if (Addition || Multiplication || Subtraction || Division) {
            secondinput = parseFloat(editinput.getText() + "");

            if (Addition) {

                displayinput.setText(firstinput + secondinput + "");
                Addition = false;

            }
            if (Subtraction) {
                displayinput.setText(firstinput - secondinput + "");
                Subtraction = false;
            }
            if (Multiplication) {
                displayinput.setText(firstinput * secondinput + "");
                Multiplication = false;
            }

            if (Division) {
                displayinput.setText(firstinput / secondinput + "");
                Division = false;
            }


        }
    }

}


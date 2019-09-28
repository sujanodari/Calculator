package com.sujan.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero,
            btnPlus, btnMinus, btnDivide, btnMultiply, btnPerctange, btnEqual, btnDecimal, btnClear,btnDoubleZero, btnBackSpace;
    TextView tvRes,tvView;
    String y="",opertor="";
    String x="";
    double num1,num2;
    double result;
    String z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //edit text

        tvView = findViewById(R.id.tvView);

        //Button
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFive = findViewById(R.id.btnFive);
        btnFour = findViewById(R.id.btnFour);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEignt);
        btnNine = findViewById(R.id.btnNine);
        btnZero = findViewById(R.id.btnZero);
        btnPerctange = findViewById(R.id.btnPercent);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnDivide = findViewById(R.id.btnDivide);
        btnMultiply = findViewById(R.id.btnMuntiply);
        btnEqual = findViewById(R.id.btnEqual);
        btnDecimal=findViewById(R.id.btnDecimal);
        btnClear=findViewById(R.id.btnClear);
        btnDoubleZero=findViewById(R.id.btnDoubleZero);
        btnBackSpace=findViewById(R.id.btnBackSpace);

        tvRes=findViewById(R.id.tvRes);


        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);
        btnZero.setOnClickListener(this);
        btnDoubleZero.setOnClickListener(this);



        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnEqual.setOnClickListener(this);
        btnPerctange.setOnClickListener(this);
        btnDecimal.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnBackSpace.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.btnClear:
                tvView.setText("0");
                tvRes.setText("");
                z="";
                y="";
                opertor="";
                break;

            case R.id.btnOne:

                x = "1";
                setText();
                checkOpeartor();
                break;

            case R.id.btnTwo:
                x = "2";
                setText();
                checkOpeartor();
                break;

            case R.id.btnThree:
                x = "3";
                setText();
                checkOpeartor();
                break;
            case R.id.btnFour:
                x = "4";
                setText();
                checkOpeartor();
                break;

            case R.id.btnFive:
                x = "5";
                setText();
                checkOpeartor();
                break;

            case R.id.btnSix:
                x = "6";
                setText();
                checkOpeartor();
                break;
            case R.id.btnEignt:
                x = "8";
                setText();
                checkOpeartor();
                break;

            case R.id.btnNine:
                x = "9";
                setText();
                checkOpeartor();
                break;

            case R.id.btnSeven:
                x = "7";
                setText();
                checkOpeartor();
                break;

            case R.id.btnZero:
                x = "0";
                setText();
                checkOpeartor();
                break;


            case R.id.btnDoubleZero:
                x = "00";
                setText();
                checkOpeartor();
                break;

            case R.id.btnDecimal:
                x=".";
                setText();
                break;

            case R.id.btnPlus:
                if(TextUtils.equals(tvView.getText().toString(),"0")){
                    return;
                }
                if(TextUtils.equals(y,"")){
                    return;
                }
                checkOpeartor();
                opertor="+";
                btnClickAfter();
                break;
            case R.id.btnMinus:
                if(TextUtils.equals(tvView.getText().toString(),"0")){
                    return;
                }
                if(TextUtils.equals(y,"")){
                    return;
                }
                checkOpeartor();
                opertor="-";
                btnClickAfter();
                break;
            case R.id.btnPercent:
                if(TextUtils.equals(tvView.getText().toString(),"0")){
                    return;
                }
                opertor="%";
                z= tvView.getText().toString();
                checkOpeartor();

                break;
            case R.id.btnMuntiply:
                if(TextUtils.equals(tvView.getText().toString(),"0")){
                    return;
                }
                if(TextUtils.equals(y,"")){
                    return;
                }
                checkOpeartor();
                opertor="×";
                btnClickAfter();
                break;
            case R.id.btnDivide:
                if(TextUtils.equals(tvView.getText().toString(),"0")){
                    return;
                }
                if(TextUtils.equals(y,"")){
                    return;
                }
                checkOpeartor();
                opertor="÷";
                btnClickAfter();
                break;

            case R.id.btnEqual:
                if(TextUtils.equals(tvView.getText().toString(),"0")){
                    return;
                }
                cal();
                break;

            case R.id.btnBackSpace:
                rollBack();
                break;
            default:

                break;


        }


    }

    public void setText(){
        y=y+x;
        tvRes.append(x);
        tvView.setText(y);


    }
    public void btnClickAfter(){
        z= tvView.getText().toString();
        y="";
        tvRes.append(opertor);

    }


    public void rollBack(){
            String rollback= tvRes.getText().toString();
        if((rollback!=null )&&(rollback.length()>0)){
            rollback=rollback.substring(0,rollback.length()-1);
           tvRes.setText(rollback);
        }
    }
    public void cal(){
        num1= Double.parseDouble(z);
        num2=Double.parseDouble(y);

        Arithmetic arithmetic1 = new Arithmetic(num1,num2,opertor);
        result= arithmetic1.calculate();
        tvView.setText(Double.toString(result));

    }

    public void checkOpeartor(){
        if(opertor!=""){
            cal();
        }
    }

}
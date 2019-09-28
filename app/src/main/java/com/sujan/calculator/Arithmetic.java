package com.sujan.calculator;

import android.widget.Toast;

public class Arithmetic {
    private double num1;
    private double num2;
    private String operator;
    private  double result;

    public Arithmetic(double num1, double num2, String operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }



    public double calculate() {
        if (operator == "+") {
            result=sum();
        } else if (operator == "-") {
            result= sub();
        } else if (operator == "×") {
            result= mul();
        } else if (operator == "÷") {
            result= divide();
        }
         else if (operator == "%") {
        result= percent();
         }
        return result;
    }

    private double sum(){
        return num1+num2;
    }
    private double sub(){
        return num1-num2;
    }
    private double mul(){
        return num1*num2;
    }
    private double divide(){
        return num1/num2;
    }
    private double percent(){
        return num1/100;
    }



}

package com.umesh.example.MyFirstProject;


import org.springframework.stereotype.Component;

@Component
public class CalculatorService {

    public double add(double a,double b){
        return a+b;
    }

    public double sub(double a,double b){

        return a-b;
    }
    public double multi(double a,double b){

        return a*b;
    }
    public double div(double a,double b) {

        if (b == 0) {

            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        else {
            return a / b;
        }
    }
}

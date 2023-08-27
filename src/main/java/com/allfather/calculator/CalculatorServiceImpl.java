package com.allfather.calculator;


import org.springframework.stereotype.Service;

public class CalculatorServiceImpl implements com.allfather.calculator.service.CalculatorService {
    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }
    @Override
    public String plus(int num1, int num2) {
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }
    @Override
    public String minus(int num1, int num2) {
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }
    @Override
    public String divide(int num1, int num2) {
        double result = (double) num1 / num2;
        return num1 + " / " + num2 + " = " + result;
    }

    @Override
    public String multiply(int num1, int num2) {
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }
}
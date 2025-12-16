package com.techPulse.service;

import com.techPulse.model.Calculator;
import org.springframework.beans.factory.annotation.Autowired;

public class CalculatorService {

    @Autowired
    private Calculator calculator;

    public Integer add() {
        return calculator.getA() + calculator.getB();
    }

    public Integer subtract() {
        return calculator.getA() - calculator.getB();
    }

    public Integer multiply() {
        return calculator.getA() * calculator.getB();
    }

    public Double divide() {
        if (calculator.getB() == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) calculator.getA() / calculator.getB();
    }


}

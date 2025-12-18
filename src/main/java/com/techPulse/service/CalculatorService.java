package com.techPulse.service;

import com.techPulse.model.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    @Autowired
    private Calculator calculator;

    public Integer add() {
        calculator.setA(10);
        calculator.setB(20);
        return calculator.getA() + calculator.getB();
    }

    public Integer subtract() {
        calculator.setA(50);
        calculator.setB(20);
        return calculator.getA() - calculator.getB();
    }

    public Integer multiply() {
        calculator.setA(10);
        calculator.setB(5);
        return calculator.getA() * calculator.getB();
    }

    public Double divide() {
        calculator.setB(5);
        calculator.setA(50);
        if (calculator.getB() == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) calculator.getA() / calculator.getB();
    }


}

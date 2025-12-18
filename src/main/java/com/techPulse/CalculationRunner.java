package com.techPulse;

import com.techPulse.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CalculationRunner implements CommandLineRunner {

    @Autowired
    private CalculatorService calculatorService;

    @Override
    public void run(String... args)  {
        System.out.println("Addition: " + calculatorService.add());
        System.out.println("Subtraction: " + calculatorService.subtract());
        System.out.println("Multiplication: " + calculatorService.multiply());

        try {
            System.out.println("Division: " + calculatorService.divide());
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }
}

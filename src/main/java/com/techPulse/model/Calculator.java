package com.techPulse.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Calculator {
    private Integer a;
    private Integer b;
}

package com.cg;

public class CalculatorService {
    private ICalculator cal;
    public CalculatorService(ICalculator cal) {
        this.cal = cal;
    }
    public int addService(int a, int b) {
        return cal.calculate(a, b);
    }
}

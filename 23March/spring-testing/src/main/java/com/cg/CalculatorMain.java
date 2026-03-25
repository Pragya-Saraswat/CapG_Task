package com.cg;

public class CalculatorMain {
    static void main(String[] args) {
//        CalculatorService cService = new CalculatorService();
//        //addService is return calculate method of interface, there is no implementation so it shows NullPointer exception
//        System.out.println(cService.addService(3,5));

        ICalculator c=(i,j)->(i+j);
        System.out.println(c.calculate(5,9));
    }
}

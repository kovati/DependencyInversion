package org.examples.example2;
public class Calculator {
    // violate DIP:
//    public double Add(double x, double y) {
//        return x + y;
//    }
//
//    public double Subtract(double x, double y) {
//        return x - y;
//    }

    // Applying DIP:
    public void calculate(CalculatorOperation operation) {
        operation.performOperation();
    }
    public void szamol(CalcOpAbstract operation) {
        operation.abstractOperation();
    }
}

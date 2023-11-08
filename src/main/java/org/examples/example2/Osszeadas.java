package org.examples.example2;

public class Osszeadas extends CalcOpAbstract {
    private double left;
    private double right;
    private double result;

    public Osszeadas(double num1, double num2) {
        this.left = num1;
        this.right = num2;
    }

    public void abstractOperation() {
        result = left + right;
        System.out.println("Az osszeadas eredmenye " + result);
    }
}

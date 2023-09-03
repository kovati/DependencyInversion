package org.examples.example2;

public class CalculatorTest {
// https://www.youtube.com/watch?v=sm1KiM4pCrA
    public static void main(String []args) {
        double number1 = 10;
        double number2 = 5;

        Calculator calculator = new Calculator();

        // violate DIP:
        System.out.println("Addition Result is " + calculator.Add(number1, number2));
        System.out.println("Substraction Result is " + calculator.Subtract(number1, number2));

//        // Applying DIP:
//        //Addition
//        CalculatorOperation addition = new Addition(number1, number2);
//        calculator.calculate(addition);
//
//        //Substraction
//        CalculatorOperation substraction = new Substraction(number1, number2);
//        calculator.calculate(substraction);
//
//        //Multiplication
//        CalculatorOperation multiplipication = new Multiplication(number1, number2);
//        calculator.calculate(multiplipication);
//
//        //Division
//        CalculatorOperation division = new Division(number1, number2);
//        calculator.calculate(division);

    }
}

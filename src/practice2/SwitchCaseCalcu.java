package practice2;

//Write a java program to create simple calculator using switch case

import java.util.Scanner;
public class SwitchCaseCalcu {
    public static void main(String[] args) {
        char operator;
        double num1;
        double num2;
        double calculator;
        Scanner obj = new Scanner(System.in);

        System.out.println("Choose Math operator : +, -, *, or /");
        operator = obj.next().charAt(0);

        System.out.println("Enter first number");
        num1 = obj.nextDouble();

        System.out.println("Enter second number");
        num2 = obj.nextDouble();

        switch (operator) {
            case '+':
                calculator = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + calculator);
                break;
            case '-':
                calculator = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + calculator);
                break;
            case '*':
                calculator = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + calculator);
                break;
            case '/':
                calculator = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + calculator);
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }
    }
}


package org.example;

public class Main {
    public static void main(String[] args) {
        /*double num1, num2;
        Scanner sc = new Scanner(System.in);
        num1 = 5;
        num2 = 7;

        System.out.println("Enter the operator (+, -, *, /):");
        char op = sc.next().charAt(0);

        double result = 0;
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator entered.");
        }

        System.out.println("\nResult:");
        System.out.println(result);*/

        Calculator c = new Calculator(5);
        c.add(3);
        c.mul(2);
        System.out.println(c.getResult());


    }
}
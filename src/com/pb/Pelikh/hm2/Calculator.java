package com.pb.pelih.hm2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;

        System.out.print("Введите число для  operand1: ");
        operand1 = scan.nextInt();

        System.out.print("Введите число для  operand2: ");
        operand2 = scan.nextInt();

        System.out.print("Введите знак арифметической операции: ");
        sign =  scan.next();
        switch (sign){
            case "*":
                System.out.println("Итого: " + operand1 + " " + sign + " " + operand2 + " = " + (operand1 * operand2));
                break;
            case "+":
                System.out.println("Итого: " + operand1 + " " + sign + " " + operand2 + " = " + (operand1 + operand2));
                break;
            case "-":
                System.out.println("Итого: " + operand1 + " " + sign + " " + operand2 + " = " + (operand1 - operand2));
                break;
            case "/":
                if (operand1 == 0 || operand2 == 0){
                    System.out.println("Ошибка! Делить на 0 нельзя. ");
                }
                else {
                    System.out.println("Итого: " + operand1 + " " + sign + " " + operand2 + " = " + (operand1 / operand2));
                }
                break;
        }
    }
}

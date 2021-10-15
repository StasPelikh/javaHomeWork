package com.pb.pelih.hm2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number;

        System.out.print("Введите целое число от 0 до 100: ");
        number = scan.nextInt();
        if (number>=0 && number <= 14 ){
            System.out.print("Введенное число попадает в интервал - [0 - 14]");
        }
        else if (number > 14 && number <= 35){
            System.out.print("Введенное число попадает в интервал - [15 - 35]");
        }
        else if (number > 35 && number <= 50){
            System.out.print("Введенное число попадает в интервал - [36 - 50]");
        }
        else if (number > 50 && number <= 100){
            System.out.print("Введенное число попадает в интервал - [51 - 100]");
        }
        else {
            System.out.print("Введенное число не попало ни в один предусмотренный интервал. ");
        }
    }
}

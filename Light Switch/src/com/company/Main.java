package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int button;

        System.out.print("Input : ");
        button = input.nextInt();

        int check = (int) Math.round(Math.sqrt(button));

        if (check * check != button) {
            System.out.println("***Lights Off***");
        }else {
            System.out.println("***Lights On***");
        }
    }
}

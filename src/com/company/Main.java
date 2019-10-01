package com.company;

import java.util.Scanner;

public class Main {
//Домашнее задание 1.1
    //Маткеримов Айдын
    public static void main(String[] args) {
        final String privet = "Привет,";
        String mir = "Мир!";
        System.out.println(privet + mir);
        System.out.println(privet);

        // на сообразительность.

        System.out.println("Как тебя зовут?");
        Scanner scanner = new Scanner (System.in);
        String user = scanner.nextLine();

        System.out.println("Добро пожаловать " + user);



    }
}

package com.company;
import java.util.Scanner;
public class Service {
    Scanner scan = new Scanner(System.in);
    public int getInt() {
        int number;
        if (scan.hasNextInt()) {
            number = scan.nextInt();
        } else {
            System.out.println("You made a mistake when entering a number. Try again.");
            scan.next();
            number = getInt();//рекурсия
        }
        return number;
    }
}
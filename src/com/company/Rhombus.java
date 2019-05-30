package com.company;
public class Rhombus extends Service {
    public void getOutput(int NumbAsterisk) {
        for (int i = 0; i <= NumbAsterisk; i = i + 2) {
            for (int putSpace = 0; putSpace < NumbAsterisk / 2 - i / 2 + NumbAsterisk % 2; putSpace++)
                System.out.print(" ");
            for (int putAstr = 0; putAstr <= i - NumbAsterisk % 2 - 1; putAstr++)
                System.out.print("*");
            System.out.println("");
        }
        for (int i = 0; i <= NumbAsterisk; i = i + 2) {
            for (int putSpace = 0; putSpace < i / 2; putSpace++)
                System.out.print(" ");
            for (int putAstr = NumbAsterisk - i - 1; putAstr >= 0; putAstr--)
                System.out.print("*");
            System.out.println("");
        }
    }
}
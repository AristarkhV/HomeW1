package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the task number: ");
        int i = 0;
        if (scanner.hasNextInt()) {
            i = scanner.nextInt();
        } else {
            System.out.println("You made a mistake when entering a number. Try again.");
            System.exit(0);
        }
        switch (i) {
            case 1: {
                FootballMatch newFootballMatch = new FootballMatch();
                System.out.println("Enter the result of team 1:");
                int firstRealOutcome = newFootballMatch.getInt();
                System.out.println("Enter the result of team 2:");
                int secondRealOutcome = newFootballMatch.getInt();
                System.out.println("Enter the forecast of team 1");
                int firstForecast = newFootballMatch.getInt();
                System.out.println("Enter the forecast of team 2:");
                int secondForecast = newFootballMatch.getInt();
                System.out.println("The match is completed - " + firstRealOutcome + ":" + secondRealOutcome
                        + ", user forecast - " + firstForecast + ":" + secondForecast);
                System.out.println("Match result: " + newFootballMatch.MatchForecast(firstRealOutcome, secondRealOutcome, firstForecast, secondForecast));
                System.exit(0);
            }
            case 2: {
                Rhombus newRhombus = new Rhombus();
                System.out.println("Enter rhombus size:");
                newRhombus.getOutput(newRhombus.getInt());
                System.exit(0);
            }
            case 3: {
                Power newPower = new Power();
                System.out.println("Enter number");
                int number = newPower.getInt();
                System. out.println("Enter power");
                int power = newPower.getInt();
                System.out.println(number + " ^ " + power + " = " + newPower.getPower(number, power));
                System.exit(0);
            }
            default: {
                System.out.println("You made a mistake when entering a number. Try again.");
                System.exit(0);
            }
        }
    }
}

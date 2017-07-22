package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to my custom game!");

        Scanner scanner = new Scanner(System.in);
        //String[] numbersAsText = scanner
         //       .nextLine()
         //       .split(" ");
        System.out.println("The tournament's participants should be either 2, 4 ,8 ,16 , 32 or 64");
        System.out.println("Enter the number of participants that the tournament will have: ");

        int numberOfParticipants = Integer.parseInt(scanner.nextLine());
        while(numberOfParticipants % 2 != 0){
            System.out.println("The number of participants should be an EVEN number -> one of this {2,4,8,16,32 or 64}");
            numberOfParticipants = Integer.parseInt(scanner.nextLine());
        }
        Fighter[] fighters = new Fighter[numberOfParticipants];

        System.out.println("Enter fighters stats now.");
        System.out.println("Each fighter has several stats which you should enter on a signle line separated by a space!");
        System.out.println("Stats:");
        System.out.println("String NAME, int AGE, double HEALTH, double ENERGY,double SPEED");
        System.out.println("Int POWER, double ACCURACY, double DEFFENCE, int DISCIPLINE, double INTELLIGENCE");
        for (int i = 0; i < numberOfParticipants; i++){
            String[] fightersStats = scanner
                    .nextLine()
                    .split(" ");

            String name = fightersStats[0];
            int age = Integer.parseInt(fightersStats[1]);
            double health = Double.parseDouble(fightersStats[2]);
            double energy = Double.parseDouble(fightersStats[3]);
            double speed = Double.parseDouble(fightersStats[4]);
            double power = Double.parseDouble(fightersStats[5]);
            double accuracy = Double.parseDouble(fightersStats[6]);
            double deffence = Double.parseDouble(fightersStats[7]);
            int discipline = Integer.parseInt(fightersStats[8]);
            double intelligence = Double.parseDouble(fightersStats[9]);

                fighters[i] = new Fighter(name, age, health, energy, speed, power, accuracy, deffence, discipline, intelligence);
        }

        System.out.println("Now that you have created all the fighters,finally it's time for the tournament to begin");

        Tournament tournament = new Tournament(fighters);
        int dayCounter = 1;

        System.out.println("The tournament will have " + fighters.length/2 + " match days!");
        for (int i = 1; i <= fighters.length / 2 - 1;i++){

            tournament.Start(dayCounter);
            dayCounter++;
        }
    }
}

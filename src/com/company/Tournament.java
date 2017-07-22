package com.company;

import java.util.Random;

public class Tournament {
    private Fighter[] fighters;

    public Tournament(Fighter[] fighters) {
        this.fighters = fighters;
    }


    public Fighter[] getFighters() {
        return fighters;
    }

    public void setFighters(Fighter[] fighters) {
        this.fighters = fighters;
    }

    public void Start(int day) {
        Fighter[]winners = new Fighter[fighters.length / 2];

        for (int i = 0; i < fighters.length / 2; i++){
            Fighter winner = Fight(fighters[i],fighters[fighters.length - 1 - i]);
            winners[i] = winner;
        }
        if (winners.length == 1) {
            System.out.println("Final day");
            System.out.println("THE WINNER OF THE TOURNAMENT IS  " + winners[0].getName().toUpperCase());
        }else{
            System.out.println("MatchDay " + day);
            System.out.println("Winners are: ");
            for (int i = 0; i < winners.length;i++){
                System.out.println(winners[i].getName() + " with "+ winners[i].getEnergy() + " energy remaining");
            }

            this.fighters = winners;
        }
    }

    private Fighter Fight(Fighter fighter1, Fighter fighter2) {
        double fighter1Overall = fighter1.Overall();
        double fighter2Overall = fighter2.Overall();

        if (fighter1Overall > fighter2Overall){
            if (Difference(fighter1Overall,fighter2Overall) < 10){
                fighter1.setEnergy(25);
            }
            return fighter1;
        }else if(fighter2Overall < fighter1Overall){
            if (Difference(fighter2Overall,fighter1Overall) < 10){
                fighter2.setEnergy(25);
            }
            return fighter2;
        }

        if (fighter1.getEnergy() > fighter2.getEnergy()){
            return fighter1;
        }else if(fighter1.getEnergy()< fighter2.getEnergy()){
            return fighter2;
        }

        if (fighter1.getIntelligence() > fighter2.getIntelligence()){
            return fighter1;
        }else if(fighter1.getIntelligence()< fighter2.getIntelligence()){
            return fighter2;
        }

        if (fighter1.getDeffence() > fighter2.getDeffence()){
            return fighter1;
        }else if(fighter1.getDeffence()< fighter2.getDeffence()){
            return fighter2;
        }

        if (fighter1.getSpeed() > fighter2.getSpeed()){
            return fighter1;
        }else if(fighter1.getSpeed()< fighter2.getSpeed()){
            return fighter2;
        }

        if (fighter1.getAge() < fighter2.getAge()){
            return fighter1;
        }else if(fighter1.getAge() > fighter2.getAge()){
            return fighter2;
        }

        if (fighter1.getAccuracy() < fighter2.getAccuracy()){
            return fighter1;
        }else if(fighter1.getAccuracy() > fighter2.getAccuracy()){
            return fighter2;
        }

        if (fighter1.getHealth() < fighter2.getHealth()){
            return fighter2;
        }
        return fighter1;
    }

    private double Difference(double fighter1Overall, double fighter2Overall) {
        return fighter1Overall - fighter2Overall;
    }
}

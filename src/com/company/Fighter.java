package com.company;

public class Fighter {
    private String name;
    private int age;
    private double health;
    private double energy;
    private double speed;
    private double power;
    private double accuracy;
    private double deffence;
    private int discipline;
    private double intelligence;
    public Fighter(String name,int age, double health, double energy,double speed, double power, double accuracy,
        double deffence, int discipline, double intelligence) {

        this.name = name;
        this.age = age;
        this.health = health;
        this.energy = energy;
        this.speed = speed;
        this.power = power;
        this.accuracy = accuracy;
        this.deffence = deffence;
        this.discipline = discipline;
        this.intelligence = intelligence;
    }

    public double Overall(){
        double overall = CalculateOverall();
        if (energy < 75){
            overall = overall - (overall * 10/100);
        }
        else if (energy < 50){
            overall = overall - (overall * 25/100);
        }
        else if (energy < 25){
            overall = overall - (overall * 50/100);
        }

        return overall;
    }

    public double CalculateOverall(){
        double overall = 0;

        double speedImpact = speed * 1.75;
        double powerImpact = power * 1.5;
        double accuracyImpact = accuracy * 1.35;
        double deffenceImpact = deffence * 1.25;
        int disciplineImpact = discipline * 10;
        double intelligenceImpact = intelligence * 2;

        overall = speedImpact + powerImpact + accuracyImpact + deffenceImpact + disciplineImpact + intelligenceImpact;
        overall = overall / 6;
        return overall;
    }

    public double getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(double intelligence) {
        this.intelligence = intelligence;
    }

    public int getDiscipline() {
        return discipline;
    }

    public void setDiscipline(int discipline) {
        this.discipline = discipline;
    }

    public double getDeffence() {
        return deffence;
    }

    public void setDeffence(double deffence) {
        this.deffence = deffence;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = this.energy - energy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

package com.vyehorova;

public class Main {
    public static void main(String[] args) {
        Helicopter starlight = new Helicopter("STARLIGHT", "Jacob Banks", 10, 40);
        Helicopter blitzkrieg = new Helicopter("BLITZKRIEG", "Roger Whales", 6, 70,"black", 900,
                true, 15);
        Helicopter thirdHelicopter = new Helicopter();

        thirdHelicopter.resetValues("HELICOPTER-3","Morgan Yu", 4, 90, "blue", 650, false, 10);

        Helicopter[] arrayOfHelicopters = {starlight, blitzkrieg, thirdHelicopter};

        for (int arrayElement = 0; arrayElement < arrayOfHelicopters.length; ++arrayElement) {
            System.out.println("\nhelicopter " + (arrayElement+1));
            System.out.println(arrayOfHelicopters[arrayElement]);
        }

        System.out.println("\nNon-static method:");
        blitzkrieg.printFuelTankVolumeInLiters();
        System.out.println("Static method:");
        Helicopter.printStaticFuelTankVolumeInLiters();

        Helicopter[] newArrayOfHelicopters = new Helicopter[4];
        int newHelicopterNumber = 0;
        do {
            newArrayOfHelicopters[newHelicopterNumber] = new Helicopter();
            newHelicopterNumber++;
        } while (newHelicopterNumber < newArrayOfHelicopters.length);

        int counter = 1;
        for (Helicopter newArrayElement: newArrayOfHelicopters) {
            System.out.println("\nempty helicopter "+counter);
            System.out.println(newArrayElement);
            counter++;
        }
    }
}

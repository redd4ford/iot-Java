package com.vyehorova;

public class Helicopter {

    private String name = "n/a";
    private Integer maxPassengers = 0;
    private Integer maxSpeedInMph = 0;

    private String pilotFullName = "n/a";
    private String color = "n/a";

    protected Integer carryingCapacityInKg = 0;
    protected Boolean hasLiftingCrane = false;

    private static Integer fuelTankVolumeInLiters = 10;

    public Helicopter() {}

    public Helicopter(String name, String pilotFullName, Integer maxPassengers,
                      Integer maxSpeedInMph) {
        this.name = name;
        this.pilotFullName = pilotFullName;
        this.maxPassengers = maxPassengers;
        this.maxSpeedInMph = maxSpeedInMph;
    }

    public Helicopter(String name, String pilotFullName, Integer maxPassengers,
                      Integer maxSpeedInMph, String color, Integer carryingCapacityInKg,
                      Boolean hasLiftingCrane, Integer fuelTankVolumeInLiters) {
        this(name, pilotFullName, maxPassengers, maxSpeedInMph);
        this.color = color;
        this.carryingCapacityInKg = carryingCapacityInKg;
        this.hasLiftingCrane = hasLiftingCrane;
        Helicopter.fuelTankVolumeInLiters = fuelTankVolumeInLiters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMaxPassengers() {
        return this.maxPassengers;
    }

    public void setMaxPassengers(Integer maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public Integer getMaxSpeedInMph() {
        return this.maxSpeedInMph;
    }

    public void setMaxSpeedInMph(Integer maxSpeedInMph) {
        this.maxSpeedInMph = maxSpeedInMph;
    }

    public String getPilotFullName() {
        return this.pilotFullName;
    }

    public void setPilotFullName(String pilotFullName) {
        this.pilotFullName = pilotFullName;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getCarryingCapacityInKg() {
        return this.carryingCapacityInKg;
    }

    public void setCarryingCapacityInKg(Integer carryingCapacityInKg) {
        this.carryingCapacityInKg = carryingCapacityInKg;
    }

    public Boolean hasLiftingCrane() {
        return this.hasLiftingCrane;
    }

    public void setLiftingCrane(Boolean hasLiftingCrane) {
        this.hasLiftingCrane = hasLiftingCrane;
    }

    public static void printStaticFuelTankVolumeInLiters() {
        System.out.println("fuel tank volume (liters): " + Helicopter.fuelTankVolumeInLiters);
    }

    public void printFuelTankVolumeInLiters() {
        System.out.println("fuel tank volume (liters): " + this.fuelTankVolumeInLiters);
    }

    public void resetValues(String name, String pilot, Integer passengers, Integer speed,
                            String color, Integer capacity, Boolean crane, Integer fuel) {
        this.name = name;
        this.pilotFullName = pilot;
        this.maxPassengers = passengers;
        this.maxSpeedInMph = speed;
        this.color = color;
        this.carryingCapacityInKg = capacity;
        this.hasLiftingCrane = crane;
        Helicopter.fuelTankVolumeInLiters = fuel;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", maxPassengers=" + maxPassengers +
                ", maxSpeedInMph=" + maxSpeedInMph +
                ", pilotFullName='" + pilotFullName + '\'' +
                ", color='" + color + '\'' +
                ", carryingCapacityInKg=" + carryingCapacityInKg +
                ", hasLiftingCrane=" + hasLiftingCrane +
                '}';
    }

}

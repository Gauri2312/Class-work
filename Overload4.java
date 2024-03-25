package com.oopexample;

class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected String fuelType;

    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double calculateFuelEfficiency() {
        return 0.0; 
    }

    public double calculateDistanceTraveled() {
        return 0.0; 
    }

    public double getMaxSpeed() {
        return 0.0; 
    }
}

class Truck extends Vehicle {
    private double fuelEfficiency;
    private double distanceTraveled;
    private double maxSpeed;

    public Truck(String make, String model, int year, String fuelType, double fuelEfficiency, double maxSpeed) {
        super(make, model, year, fuelType);
        this.fuelEfficiency = fuelEfficiency;
        this.maxSpeed = maxSpeed;
    }

   
    public double calculateFuelEfficiency() {
        return fuelEfficiency;
    }

   
    public double calculateDistanceTraveled() {
        return distanceTraveled;
    }

  
    public double getMaxSpeed() {
        return maxSpeed;
    }
}

class Carr extends Vehicle {
    private double fuelEfficiency;
    private double distanceTraveled;
    private double maxSpeed;

    public Carr(String make, String model, int year, String fuelType, double fuelEfficiency, double maxSpeed) {
        super(make, model, year, fuelType);
        this.fuelEfficiency = fuelEfficiency;
        this.maxSpeed = maxSpeed;
    }

    
    public double calculateFuelEfficiency() {
        return fuelEfficiency;
    }

   
    public double calculateDistanceTraveled() {
        return distanceTraveled;
    }

    
    public double getMaxSpeed() {
        return maxSpeed;
    }
}

class Motorcycle extends Vehicle {
    private double fuelEfficiency;
    private double distanceTraveled;
    private double maxSpeed;

    public Motorcycle(String make, String model, int year, String fuelType, double fuelEfficiency, double maxSpeed) {
        super(make, model, year, fuelType);
        this.fuelEfficiency = fuelEfficiency;
        this.maxSpeed = maxSpeed;
    }

    
    public double calculateFuelEfficiency() {
        return fuelEfficiency;
    }

   
    public double calculateDistanceTraveled() {
        return distanceTraveled;
    }

    
    public double getMaxSpeed() {
        return maxSpeed;
    }
}

public class Overload4 {
    public static void main(String[] args) {
        Truck truck = new Truck("Ford", "F150", 2022, "Diesel", 12.5, 150);
        System.out.println("Truck Fuel Efficiency: " + truck.calculateFuelEfficiency());
        System.out.println("Truck Max Speed: " + truck.getMaxSpeed());

        Carr car = new Carr("Toyota", "Camry", 2020, "Petrol", 20, 180);
        System.out.println("Car Fuel Efficiency: " + car.calculateFuelEfficiency());
        System.out.println("Car Max Speed: " + car.getMaxSpeed());

        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021, "Petrol", 25, 200);
        System.out.println("Motorcycle Fuel Efficiency: " + motorcycle.calculateFuelEfficiency());
        System.out.println("Motorcycle Max Speed: " + motorcycle.getMaxSpeed());
    }
}

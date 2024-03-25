package com.oopexample;

class Shapee {
    public double getPerimeter() {
        return 0.0; 
    }

    public double getArea() {
        return 0.0; 
    }
}

class Circlee extends Shapee {
    private double radius;

    public Circlee(double radius) {
        this.radius = radius;
    }

    
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    
    public double getArea() {
        return 3.14 * radius * radius;
    }
}

public class Overload3 {
    public static void main(String[] args) {
        Circlee circle = new Circlee(4.0);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
    }
}

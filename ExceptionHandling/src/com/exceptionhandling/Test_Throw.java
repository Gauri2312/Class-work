package com.exceptionhandling;

public class Test_Throw {

    public static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("Person is not eligible to Vote ");
        } else {
            System.out.println("Person is eligible to vote");
        }
    }

    public static void main(String[] args) {
        validate(7);
        System.out.println("rest of the code...");
    }
}

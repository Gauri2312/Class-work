package com.example;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Choose your coffee:");
        System.out.println("1. Espresso");
        System.out.println("2. Latte");
        System.out.println("3. Cappuccino");
        System.out.println("4. Americano");
        System.out.println("5. Iced Coffee");
        System.out.println("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) 
        {
            case 1:
                System.out.println("Espresso: Rs.200");
                break;
            case 2:
                System.out.println("Latte: Rs.300");
                break;
            case 3:
                System.out.println("Cappuccino: Rs.350");
                break;
            case 4:
                System.out.println("Americano: Rs.250");
                break;
            case 5:
                System.out.println("Iced Coffee: Rs.100");
                break;
            default:
                System.out.println("Invalid choice!");
        }
	}
}

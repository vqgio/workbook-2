package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("welcome to the full name generator!");

        System.out.print("Enter your first name\nFirst name: ");
        String firstName = scanner.nextLine().trim();
        System.out.print("Enter a middle name\nMiddle name: ");
        String middleName = scanner.nextLine().trim();
        System.out.print("Enter a last name\nLast name: ");
        String lastName = scanner.nextLine().trim();
        System.out.print("Enter a suffix\n Suffix: ");
        String suffix = scanner.nextLine().trim();
        String fullName = firstName + " " + middleName + " " + lastName +  ", " + suffix;
        if (middleName.isEmpty()) {
            System.out.println(firstName + " " + lastName + ", " + suffix);
        }
        if(suffix.isEmpty()) {
            System.out.println(firstName + " " + middleName + " " + lastName);
        }
        else {
            System.out.println(fullName);
        }

    }
}

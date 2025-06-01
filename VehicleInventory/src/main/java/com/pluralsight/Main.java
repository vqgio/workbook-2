package com.pluralsight;


import java.util.Scanner;

public class Main {
    private static Vehicle[] inventory = new Vehicle[20];

    public static void main(String[] args) {
        inventory[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        inventory[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        inventory[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        inventory[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        inventory[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        inventory[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);
        Scanner scanner = new Scanner(System.in);
        boolean keepGoing = true;
        while(keepGoing) {
            System.out.println("\nUsed Car Dealership Inventory");
            System.out.println("1. View All Vehicles");
            System.out.println("2. Lookup Vehicle Make/Model");
            System.out.println("3. Search By Price Range");
            System.out.println("4. Search By Color");
            System.out.println("5. Add a vehicle");
            System.out.println("6. Quit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 1:
                    viewAllVehicles();
                    break;
                case 2:
                    searchMakeAndModel();
                    break;
                case 3:
                    searchByPriceRange();
                    break;
                case 4:
                    searchByColor();
                case 5:
                    addVehicle();
                    break;
                case 6:
                    keepGoing = false;
                    break;
                default:
                    System.out.println("Sorry. Please pick from options 1-6.");

            }
        }
        scanner.close();
    }
    public static void viewAllVehicles() {
        for (Vehicle vehicle : inventory) {
            if(vehicle != null) {
                vehicle.displayInfo();
            }
        }
    }
    public static void searchMakeAndModel() {

    }
    public static void searchByPriceRange() {
        Scanner scannerPrice = new Scanner(System.in);
        System.out.println("Enter price range: ");
        float priceRange = scannerPrice.nextFloat();
        scannerPrice.nextLine();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getPrice() <= priceRange) {
                System.out.println("Here are the Vehicles in that price range");
                vehicle.displayInfo();
                return;
            }
        }
        System.out.println("Vehicle not found!");
    }
    public static void searchByColor() {

    }
    public static void addVehicle() {

    }
 }

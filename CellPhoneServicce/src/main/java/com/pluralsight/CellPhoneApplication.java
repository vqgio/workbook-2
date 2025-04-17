package com.pluralsight;

public class CellPhoneApplication {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        //phone 1 details
        CellPhone cellPhone1 = new CellPhone();

        System.out.print("What is the serial number for phone 1? ");
        cellPhone1.setSerialNumber(scanner.nextLine());

        System.out.print("What model is phone 1? ");
        cellPhone1.setModel(scanner.nextLine());

        System.out.print("Who is the carrier of phone 1? ");
        cellPhone1.setCarrier(scanner.nextLine());

        System.out.print("What is the phone number of phone 1? ");
        cellPhone1.setPhoneNumber(scanner.nextLine());

        System.out.print("Who is the owner of the phone 1? ");
        cellPhone1.setOwner(scanner.nextLine());

        //phone 2 details
        CellPhone cellPhone2 = new CellPhone();

        System.out.print("What is the serial number for phone 2? ");
        cellPhone2.setSerialNumber(scanner.nextLine());

        System.out.print("What model is phone 2? ");
        cellPhone2.setModel(scanner.nextLine());

        System.out.print("Who is the carrier of phone 2? ");
        cellPhone2.setCarrier(scanner.nextLine());

        System.out.print("What is the phone number of phone 2? ");
        cellPhone2.setPhoneNumber(scanner.nextLine());

        System.out.print("Who is the owner of the phone 2? ");
        cellPhone2.setOwner(scanner.nextLine());

        System.out.println("-- PHONE 1 --");
        System.out.println("Phone Properties:");
        System.out.println("Serial Number: " + cellPhone1.getSerialNumber());
        System.out.println("Model: " + cellPhone1.getModel());
        System.out.println("Carrier: " + cellPhone1.getCarrier());
        System.out.println("Phone Number: " + cellPhone1.getPhoneNumber());
        System.out.println("Owner: " + cellPhone1.getOwner());

        System.out.println("-- PHONE 2 --");
        System.out.println("Phone Properties:");
        System.out.println("Serial Number: " + cellPhone2.getSerialNumber());
        System.out.println("Model: " + cellPhone2.getModel());
        System.out.println("Carrier: " + cellPhone2.getCarrier());
        System.out.println("Phone Number: " + cellPhone2.getPhoneNumber());
        System.out.println("Owner: " + cellPhone2.getOwner());

        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());

    }
    //fillCellPhoneFromScanner(scanner, cellhponr, 1)
}

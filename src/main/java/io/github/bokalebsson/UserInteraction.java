package io.github.bokalebsson;

import java.util.Scanner;

public class UserInteraction {

    // Prints out the menu in the application.
    public static void displayMenu() {
        System.out.println("=== Currency Converter App ===");
        System.out.println("1. SEK to USD");
        System.out.println("2. SEK to Euro");
        System.out.println("3. USD to SEK");
        System.out.println("4. Euro to SEK");
        System.out.println("5. Exit");
        System.out.print("Choose an alternative (1-5): ");
    }

    // Handles the users menu choices in a loop until the user exits.
    public static void handleUserChoices() {
        boolean running = true;
        Scanner scanner = new Scanner(System.in);

        while (running) {
            displayMenu();
            String input = scanner.nextLine();

            // Makes some sort of action depending on what the user chooses.
            switch (input) {
                case "1":
                    System.out.println("You chose: SEK to USD");
                    break;
                case "2":
                    System.out.println("You chose: SEK to Euro");
                    break;
                case "3":
                    System.out.println("You chose: USD to SEK");
                    break;
                case "4":
                    System.out.println("You chose: Euro to SEK");
                    break;
                case "5":
                    System.out.println("Exiting application...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    }

    // Asks the user for an amount and validates the input.
    private static double askForAmount(Scanner scanner) {
        double amount = -1;
        boolean valid = false;

        // Loops until the user enters a valid (positive) amount.
        while (!valid) {
            System.out.print("Enter amount to convert: ");
            String input = scanner.nextLine();

            amount = Validator.parseAmount(input);
            if (amount < 0) {
                System.out.println("Invalid amount. Please enter a positive number (e.g., 100 or 100.50 or 100,50).");
            } else {
                valid = true;
            }
        }

        return amount;
    }

}





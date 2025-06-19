package io.github.bokalebsson;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserInteraction {

    // Prints out the menu in the application.
    public static void displayMenu() {
        System.out.println();
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
                    double sekToUsd = askForAmount(scanner);
                    double usdResult = CurrencyConverter.convertSekToUsd(sekToUsd);
                    printFormatted("%.2f SEK is %.2f USD%n[%s]", sekToUsd, usdResult, getCurrentTimestamp());
                    break;

                case "2":
                    System.out.println("You chose: SEK to Euro");
                    double sekToEuro = askForAmount(scanner);
                    double euroResult = CurrencyConverter.convertSekToEuro(sekToEuro);
                    printFormatted("%.2f SEK is %.2f Euro%n[%s]", sekToEuro, euroResult, getCurrentTimestamp());
                    break;

                case "3":
                    System.out.println("You chose: USD to SEK");
                    double usdToSek = askForAmount(scanner);
                    double sekResult1 = CurrencyConverter.convertUsdToSek(usdToSek);
                    printFormatted("%.2f USD is %.2f SEK%n[%s]", usdToSek, sekResult1, getCurrentTimestamp());
                    break;

                case "4":
                    System.out.println("You chose: Euro to SEK");
                    double euroToSek = askForAmount(scanner);
                    double sekResult2 = CurrencyConverter.convertEuroToSek(euroToSek);
                    printFormatted("%.2f Euro is %.2f SEK%n[%s]", euroToSek, sekResult2, getCurrentTimestamp());
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
            System.out.println();
            System.out.print("Enter amount to convert: ");
            String input = scanner.nextLine();

            amount = Validator.parseAmount(input);
            if (amount < 0) {
                printInvalidAmountMessage();
            } else {
                valid = true;
            }
        }

        return amount;
    }


    // Gets the current date and time, and converts the output in a formated way.
    private static String getCurrentTimestamp() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return now.format(formatter);
    }


    // Prints a more helpful message for an invalid amount.
    private static void printInvalidAmountMessage() {
        System.out.println();
        System.out.println("Oops! That doesn't look like a valid amount.");
        System.out.println("Try typing a positive number, like 250, 250.50, or 250,50.");
        System.out.println("Let's try again:");
    }


    // Formats the amount converted outputs and creates a bit more space in the terminal.
    private static void printFormatted(String format, Object... args) {
        System.out.println();
        System.out.printf(format, args);
        System.out.println();
    }

}





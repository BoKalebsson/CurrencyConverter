package io.github.bokalebsson;

import java.util.Scanner;

public class UserInteraction {

    public static void displayMenu() {
        System.out.println("=== Currency Converter App ===");
        System.out.println("1. SEK to USD");
        System.out.println("2. SEK to Euro");
        System.out.println("3. USD to SEK");
        System.out.println("4. Euro to SEK");
        System.out.println("5. Exit");
        System.out.print("Choose an alternative (1-5): ");
    }

    public static void handleUserChoices() {
        boolean running = true;
        Scanner scanner = new Scanner(System.in);

        while (running) {
//            displayMenu();
            String input = scanner.nextLine();

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
}




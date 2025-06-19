package io.github.bokalebsson;

public class Validator {

    public static double parseAmount(String input) {

        // Checks if the input is empty or null.
        if (input == null || input.isBlank()) {
            return -1;
        }

        // Allows the use of both ',' and '.'.
        input = input.replace(',', '.');

        // Convert string to double.
        try {
            double value = Double.parseDouble(input);

            // Checks if the input is a negative number.
            if (value < 0) {
                return -1;
            }
            return value;

        // Checks if the input is a numerical value.
        } catch (NumberFormatException e) {
            return -1;
        }
    }

}
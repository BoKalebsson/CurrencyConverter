package io.github.bokalebsson;

public class CurrencyConverter {

    // Exchange rates. How much one unit of USD or EUR costs in SEK.
    private static final double USD_TO_SEK_RATE = 10.75;
    private static final double EURO_TO_SEK_RATE = 11.36;

    // Converts SEK to USD.
    public static double convertSekToUsd(double sek) {
        return sek / USD_TO_SEK_RATE;
    }

    // Converts SEK to EURO.
    public static double convertSekToEuro(double sek) {
        return sek / EURO_TO_SEK_RATE;
    }

    // Converts USD to SEK.
    public static double convertUsdToSek(double usd) {
        return usd * USD_TO_SEK_RATE;
    }

    // Converts EURO to SEK.
    public static double convertEuroToSek(double euro) {
        return euro * EURO_TO_SEK_RATE;
    }

}
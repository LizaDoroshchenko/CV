package org.converter;

public class Converter {
    public double courseUSD;
    public double courseEUR;

    public Converter(double courseUSD, double courseEUR) {
        this.courseUSD = courseUSD;
        this.courseEUR = courseEUR;
    }

    public double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

    public double convert(String from, String to, double amount) {

        double result = 0;
        if (from == "BYN" && to == "USD") {
            result = amount / courseUSD;
            // System.out.println(result);
        } else if (from == "USD" && to == "BYN") {
            result = amount * courseUSD;
           // System.out.println(result);
        } else if (from == "BYN" && to == "EUR") {
            result = amount / courseEUR;
           // System.out.println(result);
        } else if (from == "EUR" && to == "BYN") {
            result = amount * courseEUR;
           // System.out.println(result);
        } else if (from == "EUR" && to == "USD") {
            result = courseEUR / courseUSD * amount;
           // System.out.println(result);
        } else if (from == "USD" && to == "EUR") {
            result = courseUSD / courseEUR * amount;
           // System.out.println(result);
        }
        return roundAvoid(result, 3);
    }

    public static void main(String[] args) {

        Converter first = new Converter(3.2, 3.6);
        first.convert("USD", "BYN", 1.5);

        checkCondition(first.convert("BYN", "USD", 0), 0);
        checkCondition(first.convert("BYN", "USD", 1), 0.313);
        checkCondition(first.convert("BYN", "USD", 1.1), 0.344);
        checkCondition(first.convert("BYN", "USD", 10), 3.125);
        checkCondition(first.convert("USD", "BYN", 0), 0);
        checkCondition(first.convert("USD", "BYN", 1), 3.2);
        checkCondition(first.convert("USD", "BYN", 1.1), 3.520);
        checkCondition(first.convert("USD", "BYN", 10), 32);
        checkCondition(first.convert("BYN", "EUR", 0), 0);
        checkCondition(first.convert("BYN", "EUR", 1), 0.278);
        checkCondition(first.convert("BYN", "EUR", 1.1), 0.306);
        checkCondition(first.convert("BYN", "EUR", 10), 2.778);
        checkCondition(first.convert("EUR", "BYN", 0), 0);
        checkCondition(first.convert("EUR", "BYN", 1), 3.600);
        checkCondition(first.convert("EUR", "BYN", 1.1), 3.960);
        checkCondition(first.convert("EUR", "BYN", 10), 36);
        checkCondition(first.convert("EUR", "USD", 0), 0);
        checkCondition(first.convert("EUR", "USD", 1), 1.125);
        checkCondition(first.convert("EUR", "USD", 1.1), 1.238);
        checkCondition(first.convert("EUR", "USD", 10), 11.250);
        checkCondition(first.convert("USD", "EUR", 0), 0);
        checkCondition(first.convert("USD", "EUR", 1), 0.889);
        checkCondition(first.convert("USD", "EUR", 1.1), 0.978);
        checkCondition(first.convert("USD", "EUR", 10), 8.889);
    }
    public static void checkCondition(double actual, double expected) {
        if (actual != expected) {
            throw new Error("actual is " + actual + ", but expected: " + expected);
        }
    }
}

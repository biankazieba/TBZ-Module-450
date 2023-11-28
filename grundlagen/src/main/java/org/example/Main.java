package org.example;

public class Main {
    public static void main(String[] args) {
        if (test_calculatePrice()) {
            System.out.println("Test erfolgreich!");
        } else {
            System.out.println("Test nicht erfolgreich!");
        }
    }

    static double calculatePrice(double baseprice, double specialprice, double extraprice, int extras,
            double discount) {
        double addon_discount;
        double result;

        // Vorher waren 5 und 3 vertauscht.
        if (extras >= 5)
            addon_discount = 15;
        else if (extras >= 3)
            addon_discount = 10;
        else
            addon_discount = 0;

        if (discount > addon_discount)
            addon_discount = discount;

        result = baseprice / 100.0 * (100 - discount) + specialprice
                + extraprice / 100.0 * (100 - addon_discount);

        return result;
    }

    static boolean test_calculatePrice() {
        return calculatePrice(1.10, 2.10, 0, 0, 0) == 3.20;
    }

}
import java.util.*;
import java.text.*;

public class cf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        System.out.println("US: " + convertPayment(payment, Locale.US));
        System.out.println("India: " + convertPayment(payment, new Locale("en", "IN")));
        System.out.println("China: " + convertPayment(payment, Locale.CHINA));
        System.out.println("France: " + convertPayment(payment, Locale.FRANCE));
    }

    public static String convertPayment(double payment, Locale country) {
        NumberFormat nF = NumberFormat.getCurrencyInstance(country);
        return nF.format(payment);
    }
}
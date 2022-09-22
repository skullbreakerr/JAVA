import java.util.Scanner;

public class Quadratic_eq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double a, b, c, discriminant;

        System.out.println("->->->->Program to Find Roots of Quadratic Equations<-<-<-<-");
        System.out.println("");

        System.out.print("Enter the value of a : ");
        a = sc.nextDouble();
        System.out.print("Enter the value of b : ");
        b = sc.nextDouble();
        System.out.print("Enter the value of c : ");
        c = sc.nextDouble();

        discriminant = b * b - 4 * a * c;

        if (discriminant == 0) {
            double r1;
            r1 = (-b + Math.pow(discriminant, 0.5)) / 2 * a;

            System.out.println("The given quadratic equation has one root  " + r1);
        } else if (discriminant < 0) {
            System.out.println("The given quadratic equation has no real roots .");
        } else {
            double r1, r2;
            r1 = (-b + Math.pow(discriminant, 0.5)) / 2 * a;
            r2 = (-b - Math.pow(discriminant, 0.5)) / 2 * a;
            System.out.println("The given quadratic equation has two real roots " + r1 + " & " + r2);

        }
        sc.close();
    }
}
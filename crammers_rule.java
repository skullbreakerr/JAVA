import java.util.Scanner;

public class crammers_rule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, e, f, x, y;

        System.out.println("======Program to Solve linear Equations using Crammer's Rule======");
        System.out.println();

        System.out.println("Enter elements of 1st equation: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter elements of 2nd equation: ");
        c = sc.nextInt();
        d = sc.nextInt();

        System.out.println("Enter constants of 1st equations : ");
        e = sc.nextInt();
        System.out.println("Enter constants of 2nd equations : ");
        f = sc.nextInt();

        if (a * d - b * c == 0) {
            System.out.println("The equation has no solution !!!");
        } else {
            x = (e * d - b * f) / (a * d - b * c);
            y = (a * f - b * c) / (a * d - b * c);
            System.out.println("The Solution of equation has x =" + x + " and y =" + y);
        }

        sc.close();
    }
}
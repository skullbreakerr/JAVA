import java.util.Scanner;

public class ch3_passbyvalue {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter any two integer : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.println("Greatest common Divisor of " + num1 + " & " + num2 + " is " + gcd(num1, num2));
        in.close();
    }

    public static int gcd(int num1, int num2) {
        int gcd = 1;
        int k = 2;

        while (k <= num1 && k <= num2) {

            if (num1 % k == 0 && num2 % k == 0)
                gcd = k;

            k++;
        }
        return gcd;

    }
}

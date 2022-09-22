import java.util.Scanner;

public class prac_5 {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        System.out.println("===>Program to find GCD<===");
        System.out.println();
        System.out.print("Enter two integer : ");
        int[] num = new int[2];
        num[0] = n.nextInt();
        num[1] = n.nextInt();

        System.out.println("Greatest Common Divisors of " + num[0] + " & " + num[1] + " is "
                + gcd(num[0], num[1]));
        n.close();
    }

    public static int gcd(int num1, int num2) {

        int gcd = 1, k = 2;
        while (k <= num1 && k <= num2) {

            if (num1 % k == 0 && num2 % k == 0) {
                gcd = k;
            }
            k++;
        }
        return gcd;

    }
}

import java.util.Scanner;

public class prrac_4_1 {

    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);

        System.out.println("==>Program to find factor<==");
        System.out.println("Enter integers: ");
        int val = n.nextInt();
        int a = 2;

        while (val != 1) {
            if (val % a == 0) {
                System.out.print(a + ",");
                val = val / a;
            } else {
                a++;
            }

        }
        n.close();
    }
}

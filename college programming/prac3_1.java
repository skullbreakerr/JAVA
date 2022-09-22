import java.util.Arrays;
import java.util.Scanner;

public class prac3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter any 3 number : ");
        int[] n = new int[3];
        for (int i = 0; i < 3; i++) {
            n[i] = in.nextInt();
        }
        // int n1 = in.nextInt();
        // int n2 = in.nextInt();
        // int n3 = in.nextInt();
        // int temp;
        // if (n1 > n2 || n1 > n3) {
        // if (n1 > n2) {
        // temp = n1;
        // n1 = n2;
        // n2 = temp;
        // }
        // if (n1 > n3) {
        // temp = n1;
        // n1 = n3;
        // n3 = temp;
        // }
        // }
        // if (n2 > n3) {
        // temp = n2;
        // n2 = n3;
        // n3 = temp;
        // }

        Arrays.sort(n);
        System.out.print("Given number in Increasing order is : ");
        for (int i = 0; i < 3; i++) {
            System.out.print(n[i] + " ");
        }
        in.close();
    }
}
import java.util.Scanner;

public class prac_6 {
    public static int[] num = new int[10];

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        for (int i = 0; i <= 9; i++) {
            System.out.print("Enter " + i + " number : ");
            num[i] = n.nextInt();
        }
        System.out.print("Numbers after reversing : ");
        reverse_string();

        n.close();
    }

    public static void reverse_string() {
        for (int j = 9; j >= 0; j--) {
            System.out.print(num[j] + " ");
        }
    }
}
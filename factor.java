import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter any integer : ");
        int val = n.nextInt();
        int k = 2;
        System.out.print("Common Factor of " + val + " is => ");
        while (val != 1) {
            if (val % k == 0) {
                System.out.print(k + ",");
                val = val / k;
            } else {
                k++;
            }
        }
        n.close();
    }
}
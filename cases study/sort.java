import java.util.Arrays;
import java.util.Scanner;

public class sort {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("Enter any three number: ");
        int[] num = new int[3];
        num[0] = n.nextInt();
        num[1] = n.nextInt();
        num[2] = n.nextInt();
        Arrays.sort(num);
        System.out.println("Number after sorting is : ");
        for (int i = 0; i < 3; i++) {
            System.out.print(num[i] + " ");
        }
        n.close();
    }

}

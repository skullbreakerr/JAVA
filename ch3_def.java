import java.util.Scanner;

public class ch3_def {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("Enter any two number : ");
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();

        System.out.println("maximum number of " + num1 + "," + num2 + "," + num3 + " is " + max(max(num1, num2), num3));
        in.close();

    }

    public static int max(int n1, int n2) {
        int result;

        if (n1 > n2)
            result = n1;
        else
            result = n2;

        return result;
    }
}

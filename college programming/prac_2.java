import java.util.Scanner;

public class prac_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter value in Feet: ");
        int feet = in.nextInt();

        System.out.println(feet + " feet in metre is " + feet * 0.3048);

        in.close();

    }

}

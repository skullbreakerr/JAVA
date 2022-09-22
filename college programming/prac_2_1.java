import java.util.Scanner;

public class prac_2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name :");
        String name = in.next();

        System.out.print(name + " Enter your weight in kg :");
        float kg = in.nextFloat();
        System.out.println();

        System.out.print("Now Enter your height in cm :");
        float cm = in.nextFloat();

        System.out.println();

        System.out.println(name + " !! Your Body Mass index (BMI) is " + kg / (cm * cm) * 10000);

        in.close();
    }

}

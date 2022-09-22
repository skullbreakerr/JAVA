import java.util.Scanner;

public class rate_asking {
    public static void main(String[] args) {
        String review, name;
        Scanner input = new Scanner(System.in);

        System.out.println("what's your name ?");
        name = input.nextLine();

        System.out.println("Hello " + name + "!!, Help us to Improve APK by giving review !!");
        System.out.println();
        review = input.nextLine();

        System.out.println("Thanks " + name + " for your review. We'll improve some features!!");
        System.out.println();
        System.out.println("This is what we get from you --> " + review);
        int r = 45;
        input.close();
        simplecircle n = new simplecircle(r);

        System.out.println(n.get_area());
    }
}

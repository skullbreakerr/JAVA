import java.util.Scanner;

public class Phone_no_gen {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("======Phone--Number--Generator======");
        System.out.println();
        System.out.print("Enter country code to Genrate Phone number : ");
        String num = n.nextLine();
        System.out.println();
        System.out.println("Generated number is : " + num + "-" + (int) (Math.random() * (1000000000 * 100)));
        n.close();
    }
}
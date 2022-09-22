import java.util.Scanner;

public class verifi_code_8dig_genra {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter message for reciever :");
        String msg = in.nextLine();

        int otp = (int) (Math.random() * 100000000);
        System.out.println(msg);
        System.out.println();
        System.out.println("verification code is : " + otp + ".Please !! Do not share with Anyone !!!");
        in.close();
    }
}

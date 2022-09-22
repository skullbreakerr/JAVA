
import java.util.Scanner;

public class otp_4digit_genra {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter message for reciever :");
        String msg = in.nextLine();

        int otp = (int) (Math.random() * 10000);
        System.out.println(msg);
        System.out.println();
        System.out.println("OTP is : " + otp + ".Do not share with Anyone !!!");
        in.close();

    }
}

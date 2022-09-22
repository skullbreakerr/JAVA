
import java.util.Scanner;

public class otp_6digit_genera {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter message for reciever : ");
        String msg = in.nextLine();

        int otp = (int) (Math.random() * 1000000);
        System.out.println(msg);
        System.out.println();
        System.out.println("OTP is : " + otp + ". Do not share with any one !!!");

        in.close();

    }

}
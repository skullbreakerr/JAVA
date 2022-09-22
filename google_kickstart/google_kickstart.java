import java.util.Scanner;

public class google_kickstart {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int bot = n / 5 + (n % 5 != 0);

            System.out.println("Test Case #" + t + " : " + bot);
        }
        in.close();
    }
}
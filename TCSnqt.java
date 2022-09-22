import java.util.Scanner;

public class TCSnqt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int hsh = 1, str = 1, nt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                str++;
            } else if (s.charAt(i) == '#') {
                hsh++;
            } else {
                nt++;
            }
        }
        if (hsh == str && hsh != 1 && str != 1) {
            System.out.println("The value of S-> 0");
            System.out.println("valid String!!");
        } else if (str > hsh) {
            System.out.println("The value of S-> " + (str - hsh));
            System.out.println("Invalid String as " + (str - hsh) + " # required.");
        } else if (hsh > str) {
            System.out.println("The value of S-> " + (str - hsh));
            System.out.println("Invalid String as " + (str - hsh) + " * required");
        } else if (nt != 0) {
            System.out.println("NO # & * were there...");
        }

        in.close();
    }
}
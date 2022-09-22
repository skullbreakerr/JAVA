package google_kickstart;

import java.util.Scanner;

class alpha {
    static String alpha[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
            "S",
            "T", "U", "V", "W", "X", "Y", "Z" };

    static void checkSeq(String str) {
        int cnt = 0;
        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] == str.charAt(0)) {

            }
        }
    }
}

class google_kickstrt2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 1; i < t; i++) {
            int str = in.nextInt();
            for (int j = 1; j < str; j++) {
                String skt = in.next();

            }
        }
        in.close();
    }
}
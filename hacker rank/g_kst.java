import java.util.Scanner;

public class g_kst {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            String s = in.next();
            char f = in.next().charAt(0);
            int pass = 0;
            for (int x = 0; x < s.length();) {
                if (s.charAt(x) != f) {
                    s.replace(s.charAt(x), f);
                    x++;
                    pass++;
                    break;
                }
                x++;
            }
            System.out.println("Case #" + (i + 1) + " : " + pass + " " + s + f);
        }
        in.close();
    }
}
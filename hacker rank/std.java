import java.util.Scanner;

public class std {
    
    public static void main(String[] argh) {
        int count = 1;
        try (Scanner in = new Scanner(System.in)) {
            while (in.hasNext()) {
                System.out.println(count + " " + in.nextLine());
                ++count;
            }
        }

    }
}

import java.util.Random;

public class prac_7 {
    public static void main(String[] args) {

        Random m = new Random(1000);
        for (int i = 0; i < 50; i++) {
            System.out.print(m.nextInt(100) + " ");
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
    }
}
import java.util.Scanner;

public class GJ_numplate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the state code : ");
        int n = in.nextInt();
        in.close();

        if (n <= 9) {
            System.out.println("Generated Number Plate : GJ0" + n + " " + char_gen('A', 'Z') + char_gen('A', 'G') + " "
                    + (int) (Math.random() * 10000));
        } else {
            System.out.println("Generated Number Plate : GJ" + n + " " + char_gen('A', 'Z') + char_gen('A', 'G') + " "
                    + (int) (Math.random() * 10000));
        }

    }

    public static char char_gen(char a, char b) {
        return (char) (a + Math.random() * (b - a + 1));
    }
}
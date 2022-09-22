import java.util.Scanner;

public class prac3_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter any single Alphabet : ");
        String a = in.next();
        String schar = a.toLowerCase();
        char c = schar.charAt(0);

        switch (c) {
            case 'a':
                System.out.println("Character you entered " + a + " is a vowel.");
                break;
            case 'e':
                System.out.println("Character you entered " + a + " is a vowel.");
                break;
            case 'i':
                System.out.println("Character you entered " + a + " is a vowel.");
                break;
            case 'o':
                System.out.println("Character you entered " + a + " is a vowel.");
                break;
            case 'u':
                System.out.println("Character you entered " + a + " is a vowel.");
                break;

            default:
                System.out.println("Character you entered " + a + " is a Consonent.");
                break;
        }
        in.close();
    }
}

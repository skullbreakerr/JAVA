import java.util.Scanner;

public class prac7_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the equations: ");
        String a = in.nextLine();
        String k = a.replaceAll(" ", "");
        if (k.length() < 3) {
            System.out.println("Minimum 2 opreator and 1 operand is required.");
        }
        int result = 0;
        int i = 0;
        while (k.charAt(i) != '+' && k.charAt(i) != '-' && k.charAt(i) != '*' && k.charAt(i) != '/') {
            i++;
        }
        switch (k.charAt(i)) {
            case '+':
                result = Integer.parseInt(k.substring(0, i)) + Integer.parseInt(k.substring(i + 1, k.length()));
                break;
            case '-':
                result = Integer.parseInt(k.substring(0, i)) - Integer.parseInt(k.substring(i + 1, k.length()));
                break;
            case '*':
                result = Integer.parseInt(k.substring(0, i)) * Integer.parseInt(k.substring(i + 1, k.length()));
                break;
            case '/':
                result = Integer.parseInt(k.substring(0, i)) / Integer.parseInt(k.substring(i + 1, k.length()));
                break;
            default:
                System.out.println("ERROR_ENTERED_WRONG--EXP:00X067_");
                break;
        }

        System.out
                .println(k.substring(0, i) + " " + k.charAt(i) + " " + k.substring(i + 1, k.length()) + " = " + result);
        in.close();
    }
}
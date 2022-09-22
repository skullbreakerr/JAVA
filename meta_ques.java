import java.util.Scanner;

public class meta_ques {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next().toLowerCase(), vowels = "aeiou";
        char new_str[] = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {

            for (int j = 0; j < vowels.length(); j++) {

                if (str.charAt(i) != vowels.charAt(j)) {
                    new_str[i] = str.charAt(i);
                } else
                    break;

            }
        }

        System.out.print("String without vowels :- ");

        for (int i = 0; i < new_str.length; i++) {
            System.out.print(new_str[i]);
        }

        in.close();
    }
}
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class meta_q {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();
        Set<Character> vwls = new HashSet<>();
        vwls.add('a');
        vwls.add('e');
        vwls.add('i');
        vwls.add('o');
        vwls.add('u');

        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!vwls.contains(c)) {
                result.append(c);
            }
        }

        System.out.println(result);

    }
}

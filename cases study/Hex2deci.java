import java.util.Scanner;

public class Hex2deci {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("+--HEXA--TO--DECIMAL--CONVERTER--+");
        System.out.print("Enter any  hexadecimal number : ");
        String hex = in.nextLine();

        System.out.println(
                "conversion of hexadecimal number " + hex + " into decimal number is " + conv(hex.toUpperCase()));
        in.close();
    }

    public static int conv(String hexchar) {
        int decimal_val = 0;

        for (int i = 0; i < hexchar.length(); i++) {

            char charhex = hexchar.charAt(i);
            decimal_val = decimal_val * 16 + hextonum(charhex);
        }
        return decimal_val;
    }

    public static int hextonum(char ch) {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else
            return ch - '0';
    }
}

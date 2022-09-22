public class prac_4 {
    public static void main(String[] args) {

        System.out.println("||=>=>=>=>Program to Generate Nmber Plate<=<=<=<=||");
        System.out.println();
        System.out.println("Generated Number plate is : " + random_char('A', 'Z') + random_char('A', 'M')
                + random_char('A', 'M') + "-" + (int) (Math.random() * 10000));
    }

    public static char random_char(char a, char b) {
        return (char) (a + Math.random() * (b - a + 1));
    }
}
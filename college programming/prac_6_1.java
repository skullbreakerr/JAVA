public class prac_6_1 {
    public static void main(String[] args) {

        System.out.println("----PROGRAM TO DISPLAY 6X6 MATRIX----");
        System.out.println();
        int[][] m = new int[6][6];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = (int) (Math.random() * 2);
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        if (odd_row(m) == true && odd_column(m) == true) {
            System.out.println("Every Row & Column has  odd number of 1's");
        } else {
            System.out.println("Every Row & Column has not odd number of 1's");
        }
    }

    public static boolean odd_row(int[][] m) {
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == 1) {
                    count++;
                }
            }

            if (count % 2 == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean odd_column(int[][] m) {
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[j].length; j++) {
                if (m[j][i] == 1) {
                    count++;
                }
            }

            if (count % 2 == 0) {
                return false;
            }
        }

        return true;
    }
}
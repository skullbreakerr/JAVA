public class array_2d {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = 1;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }
}
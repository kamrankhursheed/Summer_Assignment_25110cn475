package day_19;

public class transpose_matrix_75 {

    public static void main(String[] args) {

        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] transpose_array = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose_array[j][i] = array[i][j];
            }
        }

        System.out.println("transposed matrix: ");
        for (int[] row : transpose_array) {
            for (int x : row) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}

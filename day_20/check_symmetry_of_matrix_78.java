package day_20;

public class check_symmetry_of_matrix_78 {

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {2, 5, 6}, {3, 6, 9}};
        int[][] transpose_matrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose_matrix[j][i] = matrix[i][j];
            }
        }

        boolean is_symmetric = true;
        outer:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] != transpose_matrix[i][j]) {
                    is_symmetric = false;
                    break outer;
                }
            }
        }

        if (is_symmetric) {
            System.out.println("the given matrix is symmetric");
        } else {
            System.out.println("the given matrix is not symmetric");
        }
    }
}

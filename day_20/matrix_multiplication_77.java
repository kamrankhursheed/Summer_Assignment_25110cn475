package day_20;

public class matrix_multiplication_77 {

    public static void main(String[] args) {

        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] product_matrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    product_matrix[i][j] += matrix1[i][k] * matrix2[k][i];
                }
            }
        }

        System.out.println("the product matrix is :");
        for (int[] row : product_matrix) {
            for (int x : row) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}

package day_20;

public class column_sum_80 {

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {2, 5, 6}, {6, 6, 9}};

        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += matrix[j][i];
            }
            System.out.println("the sum of the column " + (i + 1) + " is : " + sum);
        }
    }
}

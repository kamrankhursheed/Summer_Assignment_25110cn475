package day_19;

import java.util.Scanner;

public class add_matrices_73 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] nums1 = new int[3][3];
        int[][] nums2 = new int[3][3];
        int[][] sum_matrix = new int[3][3];

        System.out.print("enter the elements of the first (3x3) matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                nums1[i][j] = sc.nextInt();
            }
        }

        System.out.print("enter the elements of the second (3x3) matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                nums2[i][j] = sc.nextInt();
            }
        }

        System.out.println("sum matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum_matrix[i][j] = nums1[i][j] + nums2[i][j];
                System.out.print(sum_matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

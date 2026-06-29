package day_17;

import java.util.Scanner;

public class common_elements_68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size of the two arrays: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] array_1 = new int[n];
        int[] array_2 = new int[m];

        System.out.print("enter the elements of the array1: ");
        for (int i = 0; i < n; i++) {
            array_1[i] = sc.nextInt();
        }

        System.out.print("enter the elements of the array2: ");
        for (int i = 0; i < m; i++) {
            array_2[i] = sc.nextInt();
        }

        System.out.print("the common elements are: ");
        for (int i = 0; i < n; i++) {
            int target = array_1[i];
            for (int j = 0; j < m; j++) {
                if (target == array_2[j]) {
                    System.out.print(target + " ");
                    break;
                }
            }
        }

        sc.close();
    }
}

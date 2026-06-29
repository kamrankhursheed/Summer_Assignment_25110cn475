package day_17;

import java.util.Scanner;

public class merge_arrays_65 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size of the two arrays which needs to be merged: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] array_1 = new int[n];
        int[] array_2 = new int[m];
        int[] merged_array = new int[n + m];

        System.out.print("enter the elements of the array1: ");
        for (int i = 0; i < n; i++) {
            array_1[i] = sc.nextInt();
            merged_array[i] = array_1[i];
        }

        System.out.print("enter the elements of the array2: ");
        for (int i = 0; i < m; i++) {
            array_2[i] = sc.nextInt();
            merged_array[i + n] = array_2[i];
        }

        System.out.print("the merged array is --> ");
        for (int x : merged_array) {
            System.out.print(x + " ");
        }
        System.out.println();

        sc.close();
    }
}

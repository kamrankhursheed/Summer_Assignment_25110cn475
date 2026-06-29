package day_17;

import java.util.Scanner;

public class union_array_66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the two arrays: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] array_1 = new int[n];
        int[] array_2 = new int[m];
        int[] union_array = new int[n + m];
        int count = 0;

        System.out.print("Enter elements of array1: ");
        for (int i = 0; i < n; i++) {
            array_1[i] = sc.nextInt();
            boolean found = false;
            for (int j = 0; j < count; j++) {
                if (union_array[j] == array_1[i]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                union_array[count++] = array_1[i];
            }
        }

        System.out.print("Enter elements of array2: ");
        for (int i = 0; i < m; i++) {
            array_2[i] = sc.nextInt();
            boolean found = false;
            for (int j = 0; j < count; j++) {
                if (union_array[j] == array_2[i]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                union_array[count++] = array_2[i];
            }
        }

        System.out.print("Union array is --> ");
        for (int i = 0; i < count; i++) {
            System.out.print(union_array[i] + " ");
        }

        sc.close();
    }
}

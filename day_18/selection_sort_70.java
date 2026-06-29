package day_18;

import java.util.Scanner;

public class selection_sort_70 {

    static void selection_sort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[min_index] > arr[j]) {
                    min_index = j;
                }
            }
            if (min_index != i) {
                // swap
                int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size(no. of elements) of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        selection_sort(arr, n);

        System.out.print("sorted array : ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        sc.close();
    }
}

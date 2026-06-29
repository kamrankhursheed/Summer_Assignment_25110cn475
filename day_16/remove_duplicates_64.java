package day_16;

import java.util.Scanner;

public class remove_duplicates_64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];

        System.out.print("enter 10 elements: ");
        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("array after removing duplicates: ");
        for (int i = 0; i < 10; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(array[i] + " ");
            }
        }

        sc.close();
    }
}

package day_15;

import java.util.Scanner;

public class rotate_array_left_58 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = {34, 56, 98, 34, 67, 55};
        int size = array.length;

        System.out.print("Enter the number of times of rotation: ");
        int rotatingFactor = sc.nextInt();

        int[] resultArr = new int[size];

        System.out.print("the rotated array is: ");
        for (int i = 0; i < size; i++) {
            resultArr[i] = array[(i + rotatingFactor) % size];
            System.out.print(resultArr[i] + " ");
        }

        System.out.println();
        sc.close();

    }
}

package day_13;
import java.util.Scanner;

public class array_input_output_49 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int arraySize = sc.nextInt();

        int[] array = new int[arraySize];

        System.out.print("Enter the elements of the array (either one by one or use buffer): ");
        for (int i = 0; i < arraySize; i++) {
            array[i] = sc.nextInt();
        }

        // for output
        for (int i = 0; i < arraySize; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        sc.close();
    }
}

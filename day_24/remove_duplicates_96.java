package day_24;

public class remove_duplicates_96 {

    public static void main(String[] args) {

        // assuming the array is sorted already
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        int n = arr.length;
        int k = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[k - 1]) {
                arr[k] = arr[i];
                k++;
            }
        }

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

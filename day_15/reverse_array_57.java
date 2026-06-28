package day_15;

public class reverse_array_57 {

    public static void main(String[] args) {

        int[] array = {56, 45, 34, 23, 67};
        int i = 0;
        int j = array.length - 1; // last element index

        while (i < j) {
            // swap
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }

        System.out.print("reversed array is: ");
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println();

    }
}

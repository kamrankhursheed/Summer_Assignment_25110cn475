package day_15;

public class move_zeroes_at_end_60 {

    public static void main(String[] args) {

        int[] array = {0, 0, 34, 56, 0, 39, 98, 0, 0, 32};
        int i = 0;
        int j = array.length - 1;

        while (i < j) {
            if (array[i] == 0) {
                if (array[j] != 0) {
                    // swap
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    i++;
                    j--;
                } else {
                    j--;
                }
            } else {
                i++;
            }
        }

        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println();

    }
}

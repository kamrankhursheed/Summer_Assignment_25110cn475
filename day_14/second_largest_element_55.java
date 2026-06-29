package day_14;

public class second_largest_element_55 {

    public static void main(String[] args) {

        int[] array = {554, 543, 234, 786, 999};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                int temp = max;
                max = array[i];
                secondMax = temp;
            }
        }

        System.out.println(secondMax);

    }
}

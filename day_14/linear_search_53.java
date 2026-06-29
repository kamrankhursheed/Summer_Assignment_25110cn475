package day_14;

public class linear_search_53 {

    public static void main(String[] args) {

        int[] arr = {34, 56, 73, 55, 60};
        int target = 0;
        int index = 0;

        for (int x : arr) {
            if (x == target) {
                System.out.println("the target index is: " + index);
                return;
            }
            index++;
        }

        System.out.println("the target is not in the array");

    }
}

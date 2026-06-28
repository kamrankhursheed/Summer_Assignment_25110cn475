package day_13;

public class array_max_min_element_51 {

    public static void main(String[] args) {

        int[] arr = {10, 23, 45, 65, 34};
        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;

        for (int x : arr) {
            mx = Math.max(mx, x);
            mn = Math.min(mn, x);
        }

        System.out.println("the maximum element is: " + mx);
        System.out.println("the minimum element is: " + mn);

    }
}

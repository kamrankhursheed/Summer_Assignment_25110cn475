package day_13;

public class count_even_odd_52 {

    public static void main(String[] args) {

        int[] arr = {45, 26, 46, 55};
        int evenCount = 0;
        int oddCount = 0;

        for (int x : arr) {
            if (x % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        System.out.println(evenCount + " even numbers & " + oddCount + " odd numbers");

    }
}

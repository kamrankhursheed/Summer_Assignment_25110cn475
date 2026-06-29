package day_14;

public class count_frequency_54 {

    public static void main(String[] args) {

        int[] array = {34, 45, 2, 2, 34, 56, 78, 65, 43, 1};
        int target = 2;
        int freq = 0;

        for (int x : array) {
            if (x == target)
                freq++;
        }

        System.out.println(freq);

    }
}

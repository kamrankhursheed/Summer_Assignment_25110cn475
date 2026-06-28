package day_14;
public class find_duplicates_56 {

    public static void main(String[] args) {

        int[] array = {34, 56, 78, 45, 34, 45};
        int[] freq = new int[100]; // 100 is the maximum range of numbers

        for (int x : array) {
            freq[x]++;
            if (freq[x] > 1)
                System.out.print(x + " ");
        }

        System.out.println();

    }
}

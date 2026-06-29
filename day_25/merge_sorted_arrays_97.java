package day_25;

import java.util.Scanner;

// assuming this problem is same as leetcode's #88 merge two sorted arrays
// because the language in assignment is TOO concise to make a conclusion
public class merge_sorted_arrays_97 {

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = n - 1;
        int j = m - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums2[i] < nums1[j]) {
                nums1[k] = nums1[j];
                j--;
            } else {
                nums1[k] = nums2[i];
                i--;
            }
            k--;
        }

        while (i >= 0) {
            nums1[k] = nums2[i];
            i--;
            k--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter m and n: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] nums1 = new int[m + n];
        int[] nums2 = new int[n];

        System.out.print("enter " + m + " elements of nums1: ");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.print("enter " + n + " elements of nums2: ");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        merge(nums1, m, nums2, n);

        System.out.print("merged array: ");
        for (int x : nums1) {
            System.out.print(x + " ");
        }
        System.out.println();

        sc.close();
    }
}

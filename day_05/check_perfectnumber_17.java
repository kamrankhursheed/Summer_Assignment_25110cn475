package day_05;

 
  import java.util.Scanner;

public class check_perfectnumber_17  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;

        while (i < n) {
            if (n % i == 0) {
                sum += i;
            }
            i++;
        }

        if (sum == n)
            System.out.println("YES it is a perfect number");
        else
            System.out.println("NO it is not a perfect number");

        sc.close();
    }
}  


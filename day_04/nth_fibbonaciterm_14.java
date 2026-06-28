package day_04; 
    import java.util.Scanner;

public class nth_fibbonaciterm_14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term number: ");
        int n = sc.nextInt();

        int f1 = 0;
        int f2 = 1;

        if (n == 1) {
            System.out.println(f1);
        } else if (n == 2) {
            System.out.println(f2);
        } else {
            for (int i = 3; i <= n; i++) {
                int temp = f1;
                f1 = f2;
                f2 = temp + f2;
            }
            System.out.println(f2);
        }
        sc.close();
    }
}


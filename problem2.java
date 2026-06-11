 import java.util.Scanner;
 public class problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int count;
        for (int i = 1; i <=10; i++) {
            count=n*i;
            System.out.println(n*i);
        }
    }
}

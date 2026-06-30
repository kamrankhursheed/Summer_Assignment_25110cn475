package day_28;

import java.util.Scanner;

public class Q_109 {
    public static void main(String[] args) {
        String book;
        int id;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        id = sc.nextInt();
        System.out.print("Enter Book Name: ");
        book = sc.next();

        System.out.println("\nLibrary Record");
        System.out.println("Book ID: " + id);
        System.out.println("Book Name: " + book);
    }
}

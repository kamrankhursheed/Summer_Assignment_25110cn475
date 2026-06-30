package day_28;

import java.util.Scanner;

public class Q_111 {
    public static void main(String[] args) {
        String name;
        int seats;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Number of Seats: ");
        seats = sc.nextInt();

        System.out.println("\nTicket Booked Successfully");
        System.out.println("Name: " + name);
        System.out.println("Seats: " + seats);
    }
}

package day_12;

public class fibonacci_series_47 {

    static void fibonacci(int totalElements) {
        int element1 = 0;
        int element2 = 1;

        if (totalElements == 1) {
            System.out.println(element1);
            return;
        }

        if (totalElements >= 2)
            System.out.print(element1 + " " + element2 + " ");

        for (int i = 3; i <= totalElements; i++) {
            int temp = element1;
            element1 = element2;
            element2 = element2 + temp;
            System.out.print(element2 + " ");
        }
    }

    public static void main(String[] args) {

        int elementCount = 0;
        fibonacci(elementCount);

    }
}

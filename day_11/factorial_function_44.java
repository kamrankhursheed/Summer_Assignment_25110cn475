public class factorial_function_44 {

    static int factorial(int n) {
        if (n < 2)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        int x = 0;
        System.out.println(factorial(x));

    }
}

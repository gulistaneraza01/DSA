package Basic;

public class RecursionApnaColl {
    protected static int sumOfAll(int num) {

        if (num == 1 || num == 0) {
            return 1;
        }

        return sumOfAll(num - 1) * num;
    }

    protected static int fibonacci(int n) {
        if (n <= 1)
            return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        int num = 5;
        System.out.println(sumOfAll(num));
        System.out.println(fibonacci(5));

    }
}

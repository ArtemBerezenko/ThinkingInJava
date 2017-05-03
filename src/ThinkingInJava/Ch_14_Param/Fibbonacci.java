package ThinkingInJava.Ch_14_Param;

/**
 * Created by Home on 16.04.2017.
 */
interface Generator<T> {T next();}

public class Fibbonacci {
    private int count = 0;
    public Integer next() {
        return fib(count++);
    }
    private int fib(int n) {
        if (n < 2) return 1;
        return fib(n - 2) + fib(n - 1);
    }

    public static void main(String[] args) {
        Fibbonacci gen = new Fibbonacci();
        for (int i = 0; i < 18; i++) {
            System.out.println(gen.next() + " ");
        }
    }
}

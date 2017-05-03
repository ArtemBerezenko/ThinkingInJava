package ThinkingInJava.Ch_12_Exceptions;

/**
 * Created by Home on 15.02.2017.
 */
public class NeverCaught {
    static void f() {
        throw new RuntimeException("Из f()");
    }
    static void g() {
        f();
    }

    public static void main(String[] args) {
        g();
    }
}

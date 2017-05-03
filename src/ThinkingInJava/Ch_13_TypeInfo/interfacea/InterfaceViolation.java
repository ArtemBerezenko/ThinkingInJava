package ThinkingInJava.Ch_13_TypeInfo.interfacea;

/**
 * Created by Home on 15.04.2017.
 */
class B implements A {
    @Override
    public void f() {}
    public void g(){}
}

public class InterfaceViolation {
    public static void main(String[] args) {
        A a = new B();
        a.f();
        //a.g(); //Ошибка компиляции
        System.out.println(a.getClass().getName());
        if (a instanceof B) {
            B b = (B)a;
            b.g();
        }
    }
}

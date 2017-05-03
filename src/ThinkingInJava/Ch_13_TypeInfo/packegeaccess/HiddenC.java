package ThinkingInJava.Ch_13_TypeInfo.packegeaccess;

import ThinkingInJava.Ch_13_TypeInfo.interfacea.A;

/**
 * Created by Home on 15.04.2017.
 */
class C implements A {
    @Override
    public void f() {
        System.out.println("public C.f()");
    }

    public void g() {
        System.out.println("public C.g()");
    }
    void u() {
        System.out.println("packege C.u()");
    }
    protected void v() {
        System.out.println("protected C.v()");
    }
    private void w() {
        System.out.println("private C.w()");
    }
}

public class HiddenC {
    public static A makeA() {
        return new C();
    }
}

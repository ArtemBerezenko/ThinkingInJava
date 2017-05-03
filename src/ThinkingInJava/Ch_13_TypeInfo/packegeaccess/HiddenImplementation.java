package ThinkingInJava.Ch_13_TypeInfo.packegeaccess;

import ThinkingInJava.Ch_13_TypeInfo.interfacea.A;

import java.lang.reflect.Method;

/**
 * Created by Home on 15.04.2017.
 */
public class HiddenImplementation {
    public static void main(String[] args) throws Exception {
        A a = HiddenC.makeA();
        a.f();
        System.out.println(a.getClass().getName());
        //Ошибка компиляции: символическое имя 'C' не найдено
        /*
        if (a instanceof C) {
            C c = (C)a;
            c.g();
         */
        //Однако рефлексия позволяет вызвать g():
        callHiddenMethod(a, "g");
        callHiddenMethod(a, "u");
        callHiddenMethod(a, "v");
        callHiddenMethod(a, "w");
    }
    static void callHiddenMethod(Object a, String methodName) throws Exception {
        Method g = a.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);
        g.invoke(a);
    }
}


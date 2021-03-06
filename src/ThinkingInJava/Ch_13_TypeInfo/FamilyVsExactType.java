package ThinkingInJava.Ch_13_TypeInfo;


/**
 * Created by Home on 27.03.2017.
 */
class Base {}

class Derived extends Base {}

public class FamilyVsExactType {
    static void test(Object x) {
        System.out.println("Тестируем x типа " + x.getClass());
        System.out.println("x instanseof Base " + (x instanceof Base));
        System.out.println("x instanseof Derived " + Base.class.isInstance(x));
        System.out.println("Derived.isInstance(x) " +
                Derived.class.isInstance(x));
        System.out.println("x.getClass() == Base.class " +
                (x.getClass() == Base.class));
        System.out.println("x.getClass() == Derived.class " +
                (x.getClass() == Derived.class));
        System.out.println("x.getClass().equals(Base.class) " +
                x.getClass().equals(Base.class));
        System.out.println("x.getClass().equals(Derived.class) " +
                (x.getClass().equals(Derived.class)));
    }

    public static void main(String[] args) {
        test(new Base());
        test(new Derived());
    }
}

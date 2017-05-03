package ThinkingInJava.Ch_13_TypeInfo;


import java.util.Random;

/**
 * Created by Home on 02.03.2017.
 */
class Initable {
    static final int staticFinal = 47;
    static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);
    static {
        System.out.println("Инициализация Initable");
    }
}

class Initable2 {
    static int staticNotFinal = 147;
    static {
        System.out.println("Инициализация Initable2");
    }
}

class Initable3 {
    static int staticNonFinal = 74;
    static {
        System.out.println("Инициализация Initable3");
    }
}

public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) throws Exception {
        Class initable = Initable.class;
        System.out.println("После создания ссылки Initable");
        System.out.println(Initable.staticFinal);
        System.out.println(Initable.staticFinal2);
        System.out.println(Initable2.staticNotFinal);
        Class initable3 = Class.forName("Initable3");
        System.out.println("После создания ссылки Initable3");
        System.out.println(Initable3.staticNonFinal);
    }
}

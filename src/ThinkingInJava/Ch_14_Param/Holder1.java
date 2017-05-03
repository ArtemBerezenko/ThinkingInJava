package ThinkingInJava.Ch_14_Param;

/**
 * Created by Home on 16.04.2017.
 */
class Automobile {}

public class Holder1 {
    private Automobile a;
    public Holder1(Automobile a) {
        this.a = a;
    }
    Automobile get() {
        return a;
    }
}

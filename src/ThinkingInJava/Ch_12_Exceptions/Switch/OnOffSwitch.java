package ThinkingInJava.Ch_12_Exceptions.Switch;

/**
 * Created by Home on 15.02.2017.
 */
public class OnOffSwitch {
    private static Switch sw = new Switch();
    static void f() throws OnOffException1, OnOffException2 {}

    public static void main(String[] args) {
        try {
            sw.on();
            f();
            sw.off();
        } catch (OnOffException1 e) {
            System.out.println("OnOffException1");
        } catch (OnOffException2 e) {
            System.out.println("OnOffException2");
        } finally {
            sw.off();
        }
    }
}

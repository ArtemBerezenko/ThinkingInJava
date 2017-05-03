package ThinkingInJava.Ch_12_Exceptions;

/**
 * Created by Home on 17.02.2017.
 */
    class BaseballException extends Exception {}

class Foul extends BaseballException {}

class Strike extends BaseballException {}

abstract class Inning {
    public Inning() throws BaseballException {}
    public void event () throws BaseballException {}
    public abstract void atBat() throws Strike, Foul;
    public void walk() {}
}

class StormException extends Exception {}

class RainedOut extends StormException {}

class PopFoul extends Foul {}

interface Storm {
    public void event() throws RainedOut;
    public void rainHard() throws RainedOut;
}


public class StormyInning extends Inning implements Storm {

    public StormyInning() throws RainedOut, BaseballException {}
    public StormyInning(String s) throws Foul, BaseballException {}
    public void event() {}
    @Override
    public void atBat() throws PopFoul {}
    @Override
    public void rainHard() throws RainedOut {}

    public static void main(String[] args) throws RainedOut {
        try {
            StormyInning si = new StormyInning();
            si.atBat();
        } catch (PopFoul e) {
            System.out.println("Pop foul");
        } catch (BaseballException e) {
            System.out.println("Обобщенное исключение");
        }

        try {
            Inning i = new StormyInning();
            i.atBat();
        } catch (Strike e) {
            System.out.println("Strike");
        } catch (Foul e) {
            System.out.println("Foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Обобщенное исключение");
        }
    }
}



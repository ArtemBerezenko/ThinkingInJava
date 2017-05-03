package ThinkingInJava.Ch_11_Collections.Example_1;

/**
 * Created by Home on 07.12.2016.
 */
public class Apple {
    private static long counter;
    private final long id = counter++;
    public long id(){
        return id;
    }
}

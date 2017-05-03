package ThinkingInJava.Ch_12_Exceptions;

/**
 * Created by Home on 17.02.2017.
 */
public class ExceptionSilencer {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } finally {
            return;
        }
    }
}

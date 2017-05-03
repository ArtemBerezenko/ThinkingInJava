package ThinkingInJava.Ch_12_Exceptions;

import java.io.FileInputStream;

/**
 * Created by Home on 25.02.2017.
 */
public class MainException {
    public static void main(String[] args) throws Exception {
        FileInputStream file = new FileInputStream("MainException.java");
        file.close();
    }
}

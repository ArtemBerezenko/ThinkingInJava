package ThinkingInJava.Ch_12_Exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;


/**
 * Created by Home on 14.01.2017.
 */
class LoggingException extends Exception {
    private static Logger logger =
            Logger.getLogger("LoggingException");

    public LoggingException() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
    public void printStackTrace(PrintWriter printWriter) {
    }
}

public class LoggingExceptions {
    public static void main(String[] args) {
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Throwed!" + e);
        }
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Throwed!" + e);
        }
    }
}



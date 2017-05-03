package ThinkingInJava.Ch_12_Exceptions;

/**
 * Created by Home on 14.01.2017.
 */
class SimpleException extends Exception {}

public class InheritingException {
    public void f() throws SimpleException {
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();
    }

     public static void main(String[] args) {
         InheritingException sed = new InheritingException();
         try {
             sed.f();
         } catch (SimpleException e) {
             System.out.println("Trowed!j");
         }
     }


}

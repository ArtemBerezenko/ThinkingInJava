package ThinkingInJava.Ch_12_Exceptions;

/**
 * Created by Home on 21.02.2017.
 */
public class Cleanup {
    public static void main(String[] args) {
        try {
            InputFile in = new InputFile("Cleanup.java");
            try {
                String s;
                int i = 1;
                while ((s = in.getLine()) != null) {
                    // Построчная обработка...
                }
            } catch(Exception e) {
                    System.out.println("Перехвачено Exception в main");
                    e.printStackTrace(System.out);
                } finally {
                in.dispose();
            }
        } catch (Exception e) {
            System.out.println("Сбой при конструировании InputFile");
        }
    }
}

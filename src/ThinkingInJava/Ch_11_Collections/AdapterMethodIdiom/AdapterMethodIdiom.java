package ThinkingInJava.Ch_11_Collections.AdapterMethodIdiom;

import java.util.Arrays;

/**
 * Created by Home on 08.01.2017.
 */
public class AdapterMethodIdiom {
    public static void main(String[] args) {
        ReversibleArrayList<String> ral =
                new ReversibleArrayList<>(Arrays.asList("To be or not to be".split(" ")));
        for (String str : ral) {
            System.out.print(str + " ");
        }
        System.out.println();
        for (String str : ral.reversed()) {
            System.out.print(str + " ");
        }
    }
}

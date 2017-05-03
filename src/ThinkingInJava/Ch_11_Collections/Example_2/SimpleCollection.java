package ThinkingInJava.Ch_11_Collections.Example_2;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Home on 07.12.2016.
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            c.add(i);
        }
        for(Integer i : c){
            System.out.print(i + ", ");

        }
    }
}

package ThinkingInJava.Ch_11_Collections.Example_1;

import java.util.ArrayList;

/**
 * Created by Home on 07.12.2016.
 */
public class GenericsAndUcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());
        for(Apple c : apples){
            System.out.println(c);
        }
    }
}

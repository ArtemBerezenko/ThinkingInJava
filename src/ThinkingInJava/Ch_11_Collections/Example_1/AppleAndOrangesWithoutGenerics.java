package ThinkingInJava.Ch_11_Collections.Example_1;

import java.util.ArrayList;

/**
 * Created by Home on 07.12.2016.
 */
public class AppleAndOrangesWithoutGenerics {
//        @SuppressWarnings("unchecked")
        public static void main(String[] args) {
//            ArrayList apples = new ArrayList();
            ArrayList<Apple> apples = new ArrayList<>();
            for(int i = 0; i < 3; i++) {
                apples.add(new Apple());
//                apples.add(new Orange());
            }
            for(int i = 0; i < apples.size(); i++) {
                System.out.println(apples.get(i).id());
//                ((Apple)apples.get(i)).id();
            }
                for(Apple c : apples){
                    System.out.println(c.id());
                }

        }
}

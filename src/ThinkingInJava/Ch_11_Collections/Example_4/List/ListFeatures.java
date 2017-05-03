package ThinkingInJava.Ch_11_Collections.Example_4.List;

import ThinkingInJava.Ch_13_TypeInfo.pets.*;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import static jdk.nashorn.internal.objects.Global.print;


/**
 * Created by Home on 10.12.2016.
 */
public class ListFeatures {
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Pet> pets = Pets.arrayList(7);
        print("1: " + pets);
        Hamster h = new Hamster();
        pets.add(h);
        print("2: " + pets);
        print("3: " + pets.contains(h));
        pets.remove(h);
        Pet p = pets.get(2);
        print("4: " + p + " " + pets.indexOf(p));
        Pet cymric = new Cymric();
        print("5: " + pets.indexOf(cymric));
        print("6: " + pets.remove(cymric));
        print("7: " + pets.remove(p));
        print("8: " + pets);
        pets.add(3, new Mouse());
        print("9: " + pets);
        List<Pet> sub = pets.subList(1, 4);
        print("subList: " + sub);
        print("10: " + pets.containsAll(sub));
//        Collections.sort(sub);
        print("sorted subList: " + sub);
        print("11: " + pets.containsAll(sub));
        Collections.shuffle(sub, rand);
        print("shuffled subList: " + sub);
        print("12: " + pets.containsAll(sub));
    }
}

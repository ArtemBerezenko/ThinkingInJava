package ThinkingInJava.Ch_11_Collections.MultiIterableClass;

import java.util.*;

/**
 * Created by Home on 09.01.2017.
 */
public class MultiIterableClass extends IterableClass {
    public Iterable<String> reversed() {
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    int current = words.length - 1;

                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public String next() {
                        return words[current--];
                    }

                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    public Iterable<String > randomized() {
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                List<String> shuffled =
                        new ArrayList<>(Arrays.asList(words));
                Collections.shuffle(shuffled, new Random(47));
                return shuffled.iterator();
            }
        };
    }

    public static void main(String[] args) {
        MultiIterableClass mic = new MultiIterableClass();
        for (String str : mic.reversed()) {
            System.out.print(str + " ");
        }
        System.out.println();
        for (String str : mic.randomized()) {
            System.out.print(str + " ");
        }
        System.out.println();
        for (String str : mic) {
            System.out.print(str + " ");
        }
    }
}

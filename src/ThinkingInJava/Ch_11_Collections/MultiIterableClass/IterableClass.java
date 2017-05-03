package ThinkingInJava.Ch_11_Collections.MultiIterableClass;

import java.util.Iterator;

/**
 * Created by Home on 09.01.2017.
 */
public class IterableClass implements Iterable<String>{
    protected String[] words = ("And that is how " +
    "we know the Earth to be banana-shaped.").split(" ");

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (String str : new IterableClass())
            System.out.print(str + " ");
    }
}

package ThinkingInJava.Ch_11_Collections.PriorityQueue;

/**
 * Created by Home on 05.01.2017.
 */

import ThinkingInJava.Ch_11_Collections.Queue.QueueDemo;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue =
                new PriorityQueue<Integer>();
        Random rand = new Random(47);
        for (int i = 0; i < 10; ++i) {
            priorityQueue.offer(rand.nextInt(i + 10));
            QueueDemo.printQ(priorityQueue);

            List<Integer> ints = Arrays.asList(25, 22, 20,
                    18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
            priorityQueue = new PriorityQueue<>(ints);
            QueueDemo.printQ(priorityQueue);
            priorityQueue = new PriorityQueue<>(
                    ints.size());
            priorityQueue.addAll(ints);
            QueueDemo.printQ(priorityQueue);

            String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
            List<String> strings = Arrays.asList(fact.split(""));
        }

    }
}

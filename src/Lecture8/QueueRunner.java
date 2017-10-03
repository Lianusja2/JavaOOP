package Lecture8;

/**
 * Created by inna.pshenychna on 10/3/2017.
 */
public class QueueRunner {

    public static void main(String[] args){
        Queue<Integer> queue = new LinkedQueue<>();
        System.out.println("----------------------Linked Queue  ----------------------");
        testQueue(queue);

        Queue<Integer> queueArray = new ArrayQueue<>();
        System.out.println("----------------------Array Queue ----------------------");
        testQueue(queueArray);

        Queue<Integer> queueList = new LinkedListQueue<>();
        System.out.println("----------------------Linked List Queue ----------------------");
        testQueue(queueList);

    }

    private static void testQueue(Queue<Integer> queue){
        System.out.println("Element: "+queue.element());
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        System.out.println("Peek: "+queue.peek());
        for (Integer a : queue) {
            System.out.println(a);
        }
        System.out.println("Remove "+ queue.remove());
        for (Integer a : queue) {
            System.out.println(a);
        }

    }
}

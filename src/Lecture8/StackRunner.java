package Lecture8;

/**
 * Created by inna.pshenychna on 10/3/2017.
 */
public class StackRunner {

    public static void main(String[] args){
        Stack<Integer> stack = new LinkedStack<>();
        System.out.println("----------------------Linked Queue  ----------------------");
        testStack(stack);

        Stack<Integer> stackArray = new ArrayStack<>();
        System.out.println("----------------------Array Queue ----------------------");
        testStack(stackArray);

        Stack<Integer> stackList = new LinkedListStack<>();
        System.out.println("----------------------Linked List Queue ----------------------");
        testStack(stackList);



    }

    private static void testStack(Stack<Integer> stack){
        System.out.println("peek: "+stack.peek());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Peek: "+stack.peek());
        for (Integer a : stack) {
            System.out.println(a);
        }
        System.out.println("Remove "+ stack.pop());
        for (Integer a : stack) {
            System.out.println(a);
        }

    }
}

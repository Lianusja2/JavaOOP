package Lecture8;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Created by inna.pshenychna on 10/3/2017.
 */
public class LinkedListStack<E> implements Stack<E> {
    private LinkedList<E> list;

    public LinkedListStack() {
        this.list = new LinkedList<>();
    }

    @Override
    public void push(E e) {
        list.add(e);
    }

    @Override
    public E pop() {
        if (isEmpty()) throw new NoSuchElementException("Stack is empty");
        else return peek();
    }

    @Override
    public E peek() {
        if (isEmpty()) return null;
        else {
            E elem = list.getLast();
            list.removeLast();
            return elem;
        }
    }


    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.size() == 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedListStackIterator();
    }

    private class LinkedListStackIterator implements Iterator {

        private int current;

        public LinkedListStackIterator() {
            this.current = 0;
        }

        @Override
        public boolean hasNext() {
            return current != size();
        }

        @Override
        public E next() {
            return list.get(current++);
        }
    }
}

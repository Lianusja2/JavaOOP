package Lecture8;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Created by inna.pshenychna on 10/3/2017.
 */
public class LinkedListQueue<E> implements Queue<E> {
    private LinkedList<E> list;

    public LinkedListQueue() {
        this.list = new LinkedList<>();
    }

    @Override
    public void offer(E e) {
        list.add(e);
    }

    @Override
    public E remove() {
        if (isEmpty()) throw new NoSuchElementException("Queue is empty");
        else return poll();
    }

    @Override
    public E poll() {
        if (isEmpty()) return null;
        else {
            E elem = list.getFirst();
            list.removeFirst();
            return elem;
        }
    }

    @Override
    public E element() {
        if (isEmpty()) {
            return null;
        } else return list.getFirst();
    }

    @Override
    public E peek() {
        if (element() == null) {
            throw new NoSuchElementException("Queue is empty");
        } else return element();
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
    public boolean contains(E elem) {
        return list.contains(elem);
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedListQueueIterator();
    }

    private class LinkedListQueueIterator implements Iterator {

        private int current;

        public LinkedListQueueIterator() {
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

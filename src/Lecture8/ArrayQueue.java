package Lecture8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by inna.pshenychna on 10/3/2017.
 */
public class ArrayQueue<E> implements Queue<E> {
    private E[] elems;
    private int size;
    private int arraySize;
    private int expansionCoefficient;


    public ArrayQueue() {
        this.arraySize = 3;
        this.size = 0;
        this.elems = (E[]) new Object[this.arraySize];
        this.expansionCoefficient = 2;
    }

    public ArrayQueue(int arraySize, int expansionCoefficient) {
        this.arraySize = arraySize;
        this.expansionCoefficient = expansionCoefficient;
        this.size = 0;
        this.elems = (E[]) new Object[this.arraySize];
    }

    public ArrayQueue(int arraySize) {
        this.arraySize = arraySize;
        this.size = 0;
        this.elems = (E[]) new Object[this.arraySize];
        this.expansionCoefficient = 2;
    }

    @Override
    public void offer(E e) {
        if (size == 0) {
            elems[0] = e;
            size++;
        } else {
            if((size+1)>arraySize){
                arraySize=arraySize*expansionCoefficient;
                elems = Arrays.copyOf(elems, arraySize);
            }
            elems[size++] = e;
        }
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
            E elem = elems[0];
            for (int i = 0; i < (size - 1); i++) {
                elems[i] = elems[i + 1];
            }
            elems[size--] = null;
            return elem;
        }

    }

    @Override
    public E element() {
        if (isEmpty()) {
            return null;
        } else return elems[0];
    }

    @Override
    public E peek() {
        if (element() == null) {
            throw new NoSuchElementException("Queue is empty");
        } else return element();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(E elem) {
        for (int i = 0; i < size; i++) {
            if (elems[i].equals(elem))
                return true;
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayQueueIterator();
    }

    private class ArrayQueueIterator implements Iterator {

        private int current;

        public ArrayQueueIterator() {
            this.current = 0;
        }

        @Override
        public boolean hasNext() {
            return current != size();
        }

        @Override
        public E next() {
            return elems[current++];
        }
    }
}

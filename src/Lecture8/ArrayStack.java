package Lecture8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by inna.pshenychna on 10/3/2017.
 */
public class ArrayStack<E> implements Stack<E> {
    private E[] elems;
    private int size;
    private int arraySize;
    private int expansionCoefficient;


    public ArrayStack() {
        this.arraySize = 3;
        this.size = 0;
        this.elems = (E[]) new Object[this.arraySize];
        this.expansionCoefficient = 2;
    }

    public ArrayStack(int arraySize, int expansionCoefficient) {
        this.arraySize = arraySize;
        this.expansionCoefficient = expansionCoefficient;
        this.size = 0;
        this.elems = (E[]) new Object[this.arraySize];
    }

    public ArrayStack(int arraySize) {
        this.arraySize = arraySize;
        this.size = 0;
        this.elems = (E[]) new Object[this.arraySize];
        this.expansionCoefficient = 2;
    }

    @Override
    public void push(E e) {
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
    public E pop() {
        if (isEmpty()) throw new NoSuchElementException("Stack is empty");
        else return peek();
    }

    @Override
    public E peek() {
        if (isEmpty()) return null;
        else {
            E elem = elems[size-1];
            elems[size--] = null;
            return elem;
        }

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
    public Iterator<E> iterator() {
        return new ArrayStackIterator();
    }

    private class ArrayStackIterator implements Iterator {

        private int current;

        public ArrayStackIterator() {
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

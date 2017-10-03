package Lecture8;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by inna.pshenychna on 10/3/2017.
 */
public class LinkedStack<E> implements Stack<E> {
    private static class Node<E> {
        E item;
        Node<E> prev;
        Node<E> next;

        Node(E item, Node<E> prev, Node<E> next) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public LinkedStack() {
        tail = null;
        head = null;
        size = 0;
    }

    @Override
    public void push(E e) {
        if (size() == 0) {
            head = new Node(e, null, null);
            tail = head;
        } else {
            Node<E> elem = tail;
            Node<E> newElem = new Node<E>(e, elem, null);
            tail = newElem;
            elem.next = newElem;
        }
        size++;

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
            Node<E> elem = tail;
            Node<E> elemPreviose = tail.prev;
            elemPreviose.next = null;
            tail = elemPreviose;
            size--;
            return elem.item;
        }
    }



    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedStackIterator();
    }

    private class LinkedStackIterator implements Iterator {

        private Node<E> currentNode = null;

        @Override
        public boolean hasNext() {
            if (currentNode == null)
                return !isEmpty();
            else
                return currentNode.next != null;
        }

        @Override
        public E next() {
            if (currentNode == null) {
                currentNode = head;

            } else if (currentNode.next == null) {
                throw new NoSuchElementException("Can not get next.");
            } else {
                currentNode = currentNode.next;
            }
            return currentNode.item;
        }

    }
}

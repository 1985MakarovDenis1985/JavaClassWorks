package myLinkedList.model;

import myLinkedList.interfaces.ILinkedList;

import java.util.Iterator;

public class MyLinkedList<E> implements ILinkedList<E> {
    private Node<E> first;
    private Node<E> last;
    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public int indexOf(Object o) {
        int index = 0;
        if (o != null) {
            for (Node<E> x = first; x != null; x = x.next, index++) {
                if (o.equals(x.element)) {
                    return index;
                }
            }
        } else {
            for (Node<E> x = first; x != null; x = x.next, index++) {
                if (o == x.element) { // ищем null поэтому ==
                    return index;
                }
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int index = size - 1;
        if (o != null) {
            for (Node<E> x = last; x != null; x = x.prev, index--) {
                if (o.equals(x.element)) {
                    return index;
                }
            }
        } else {
            for (Node<E> x = last; x != null; x = x.prev, index--) {
                if (o == x.element) { // ищем null поэтому ==
                    return index;
                }
            }
        }
        return -1;
    }

    @Override
    public E get(int index) {
        Node<E> node = getNodeByIndex(index);
        return node.element;
    }

    private Node<E> getNodeByIndex(int index) {
        rangeCheck(index);
        Node<E> node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    private void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index + " out of bounds");
        }
    }

    @Override
    public E set(int index, E element) {
        Node<E> node = getNodeByIndex(index);
        E temp = node.element;
        node.element = element;
        return temp;
    }

    @Override
    public boolean add(E element) {
        Node<E> newNode = new Node(last, element, null);
        if (last != null) {
            last.next = newNode;
        } else {
            first = newNode;
        }
        last = newNode;
        size++;
        return true;
    }

    @Override
    public boolean add(int index, E element) {
        if (index == size) {
            add(element);
        } else {
            Node<E> newNode = new Node<>(last, element, null);
            Node<E> startEl = getNodeByIndex(index);
            if (index != 0) {
                newNode.prev = startEl.prev;
                startEl.prev.next = newNode;
                startEl.prev = newNode;
                newNode.next = startEl;
            } else {
                startEl.prev = newNode;
                newNode.next = startEl;
                first = newNode;
            }
            size++;
        }
        return true;
    }

    @Override
    public E remove(int index) {
        Node<E> node = getNodeByIndex(index);
        return unlink(node);
    }

    private E unlink(Node<E> node) {
        E element = node.element;
        Node<E> next = node.next;
        Node<E> prev = node.prev;
        if (prev != null) {
            prev.next = next; // prev.next.next
            node.prev = null;
        } else {
            first = next;
        }

        if (next != null) {
            next.prev = prev;
            node.next = null;
        } else {
            last = prev;
        }

        node.element = null;
        size--;
        return element;
    }

    @Override
    public void clear() {
        first = last = null;
        size = 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() { // анонимный класс
            int currPos = 0;

            @Override
            public boolean hasNext() {
                return currPos < size;
            }

            @Override
            public E next() {
                E el = get(currPos++);
                return el;
            }

            @Override
            public void remove() {
                MyLinkedList.this.remove(--currPos);
            }
        };
    }

    private static class Node<E> {
        E element;
        Node<E> prev;
        Node<E> next;

        public Node(Node<E> prev, E element, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }
}
package model;

import interfaces.ISet;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyHashSet<E> implements ISet<E> {

    private LinkedList<E>[] hashset;
    private int size;
    private int capacity;
    private double loadFactor;

    public MyHashSet(int capacity, double loadFactor) {
        this.capacity = capacity;
        this.loadFactor = loadFactor;
        hashset = new LinkedList[capacity];
    }

    public MyHashSet(int capacity) {
        this(capacity, 0.75);
    }

    public MyHashSet() {
        this(16);
    }

    @Override
    public boolean add(E element) {
        if (element == null) return false;
        if (size >= capacity * loadFactor) {
            rebuildHashSet();
        }
        int index = getIndex(element);
        if (hashset[index] == null) {
            hashset[index] = new LinkedList<>();
        }
        if (hashset[index].contains(element)) {
            return false;
        }
        hashset[index].add(element);
        size++;
        return true;
    }

    private void rebuildHashSet() {
        capacity <<= 1; // capacity *= 2;
        LinkedList<E>[] newHashSet = new LinkedList[capacity];
        for (int i = 0; i < hashset.length; i++) {
            if (hashset[i] != null) {
                for (E element : hashset[i]) {
                    int index = getIndex(element);
                    if (newHashSet[index] == null) {
                        newHashSet[index] = new LinkedList<>();
                    }
                    newHashSet[index].add(element);
                }
            }
        }
        hashset = newHashSet;
    }

    private int getIndex(E element) {
        int hashCode = element.hashCode();
        hashCode = hashCode >= 0 ? hashCode : -hashCode;
        return hashCode % capacity;
    }

    @Override
    public boolean contains(E element) {
        if (element == null) return false;
        int index = getIndex(element);
        if (hashset[index] == null) return false;
        return hashset[index].contains(element);
    }

    @Override
    public boolean remove(E elements) {
        if (elements == null) return false;
        int index = getIndex(elements);
        if (hashset[index] == null) return false;
        boolean res = hashset[index].remove(elements);
        if (res) size--;
        return res;
    }

    @Override
    public int size() {
        return size;
    }


    @Override
    public Iterator<E> iterator() {
        LinkedList<E> newLinkedList = new LinkedList<>();
        for (int i = 0; i < hashset.length; i++) {
            if (hashset[i] != null){
                for (int j = 0; j < hashset[i].size(); j++) {
                    newLinkedList.add(hashset[i].get(j));
                }
            }
        }
        return newLinkedList.iterator();
    }
}

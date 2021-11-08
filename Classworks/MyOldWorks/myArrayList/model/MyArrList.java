package myArrayList.model;

import myArrayList.interfaces.IList;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrList<E> implements IList<E> {
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8; // 8- 32 байта
    private Object[] elementData;
    private int size;

    public MyArrList() {
        this(10); // принимает нижний конструктор
        /* elementData = new Object[10] */
    }

    public MyArrList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal capacity" + initialCapacity);
        }
        if (initialCapacity > MAX_ARRAY_SIZE) {
            initialCapacity = MAX_ARRAY_SIZE;
        }
        elementData = new Object[initialCapacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int indexOf(Object o) {
        if (o != null) {
            for (int i = 0; i < size; i++) {
                if (o.equals(elementData[i])) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o == elementData[i]) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        if (o != null) {
            for (int i = size - 1; i >= 0; i--) {
                if (o.equals(elementData[i])) {
                    return i;
                }
            }
        } else {
            for (int i = size - 1; i >= 0; i--) {
                if (o == elementData[i]) {
                    return i;
                }
            }
        }
        return -1;
    }

    @SuppressWarnings("unchecked")
    @Override
    public E get(int index) {
        rangeCheck(index);
        return (E) elementData[index];
    }

    private void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index + " out of bounds");
        }
    }

    @Override
    public E set(int index, E element) {
        rangeCheck(index);
        E remEl = (E) elementData[index];
        elementData[index] = element;
        return remEl;
    }

    @Override
    public boolean add(E element) {
        ensureCapacity();
        elementData[size++] = element;
        return true;
    }

    public boolean add(int index, E element) {
        if (index == size) {
            return add(element);
        }
        rangeCheck(index);
        ensureCapacity();
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[index] = element;
        size++;
        return true;
    }

    private void ensureCapacity() {
        if (size == MAX_ARRAY_SIZE) {
            throw new OutOfMemoryError();
        }
        if (size == elementData.length) {
//            int newCapacity = elementData.length + elementData.length / 2 + 1;
            int newCapacity = elementData.length + (elementData.length >> 1) + 1; // сдвиг в лево * 2 | сдвиг в право делить на два
            if (newCapacity > MAX_ARRAY_SIZE || newCapacity < 0) {
                newCapacity = MAX_ARRAY_SIZE;
            }
            elementData = Arrays.copyOf(elementData, newCapacity); // возвращает тотже массив только + увеличили размер
        }
    }


    @Override
    public E remove(int index) {
        rangeCheck(index);
        E remEl = (E) elementData[index];
        System.arraycopy(elementData, index + 1, elementData, index, size - index - 1);
        size--;
        return remEl;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            elementData[i] = null;
        }
        size = 0;
    }

    @Override
    public Iterator <E> iterator() {
        return new Iterator<E>() { // анонимный класс
            int currPos = 0;

            @Override
            public boolean hasNext() {
                return currPos < size;
            }

            @Override
            public E next() {
                E el = (E) elementData[currPos++];
                return el;
            }

            @Override
            public void remove(){
                MyArrList.this.remove(--currPos);
            }
        };
    }
}

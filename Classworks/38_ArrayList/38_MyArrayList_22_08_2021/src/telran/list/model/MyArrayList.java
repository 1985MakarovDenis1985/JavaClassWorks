package telran.list.model;

import java.util.Arrays;
import java.util.Iterator;

import telran.list.interfaces.IList;

public class MyArrayList<E> implements IList<E> {
	private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
	private Object[] elementData;
	private int size;

	public MyArrayList() {
		this(10);
		// elementData = new Object[10];
	}

	public MyArrayList(int initialCapacity) {
		if (initialCapacity < 0) {
			throw new IllegalArgumentException("Illegal capacity: " + initialCapacity);
		}
		if (initialCapacity > MAX_ARRAY_SIZE) {
			initialCapacity = MAX_ARRAY_SIZE;
		}

		elementData = new Object[initialCapacity];
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<E>() {

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public E next() {
				// TODO Auto-generated method stub
				return null;
			}
		};
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
		// TODO Auto-generated method stub
		if (o != null) {
			for (int i = size - 1; i >= 0; i--) {
				if (o.equals(elementData[i])) {
					return i;
				}
			}
		} else {
			for (int i = size - 1; i >= 0; i--) {
				if (elementData[i] == null) {
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
		// TODO Auto-generated method stub
		rangeCheck(index);
		@SuppressWarnings("unchecked")
		E remElem = (E) elementData[index];
		elementData[index] = element;
		return remElem;
	}

	@Override
	public boolean add(E element) {
		ensureCapacity();
		elementData[size++] = element;
		return true;
	}

	private void ensureCapacity() {
		if (size == MAX_ARRAY_SIZE) {
			throw new OutOfMemoryError();
		}
		if (size == elementData.length) {
			int newCapacity = elementData.length + (elementData.length >> 1) + 1;
			if (newCapacity > MAX_ARRAY_SIZE || newCapacity < 0) {
				newCapacity = MAX_ARRAY_SIZE;
			}
			elementData = Arrays.copyOf(elementData, newCapacity);
		}

	}

	@Override
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

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

}

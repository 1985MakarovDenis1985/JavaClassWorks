package telran.set.model;

import java.util.Iterator;
import java.util.LinkedList;

import telran.set.interfaces.ISet;

public class MyHashSet<E> implements ISet<E> {
	private LinkedList<E>[] hashset;
	private int size;
	private int capacity;
	private double loadfactor;

	public MyHashSet(int capacity, double loadfactor) {
		this.capacity = capacity;
		this.loadfactor = loadfactor;
		hashset = new LinkedList[capacity];
	}

	public MyHashSet(int capacity) {
		this(capacity, 0.75);
	}

	public MyHashSet() {
		this(16);
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
	public boolean add(E element) {
		if (element == null) {
			return false;
		}
		if (size >= capacity * loadfactor) {
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
		int hashcode = element.hashCode();
		hashcode = hashcode >= 0 ? hashcode : -hashcode;
		return hashcode % capacity;
	}

	@Override
	public boolean contains(E element) {
		if (element == null) {
			return false;
		}
		int index = getIndex(element);
		if (hashset[index] == null) {
			return false;
		}
		return hashset[index].contains(element);
	}

	@Override
	public boolean remove(E element) {
		if (element == null) {
			return false;
		}
		int index = getIndex(element);
		if (hashset[index] == null) {
			return false;
		}
		boolean res = hashset[index].remove(element);
		if(res) {
			size--;
		}
		return res;
	}

	@Override
	public int size() {
		return size;
	}

}

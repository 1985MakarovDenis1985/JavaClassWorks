package telran.list.model;

import java.util.Iterator;

import telran.list.interfaces.IList;

public class MyLinkedList<E> implements IList<E> {
	private Node<E> first;
	private Node<E> last;
	private int size;

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
		int index = 0;
		if (o != null) {
			for (Node<E> x = first; x != null; x = x.next, index++) {
				if (o.equals(x.element)) {
					return index;
				}
			}
		} else {
			for (Node<E> x = first; x != null; x = x.next, index++) {
				if (o == x.element) {
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
				if (o == x.element) {
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
		E tmp = node.element;
		node.element = element;
		return tmp;
	}

	@Override
	public boolean add(E element) {
		Node<E> newNode = new Node<>(last, element, null);
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
		// TODO Auto-generated method stub
		return false;
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
			prev.next = next;// node.next
			node.prev = null;
		} else {
			first = next;
		}
		if (next != null) {
			next.prev = prev;// node.prev
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

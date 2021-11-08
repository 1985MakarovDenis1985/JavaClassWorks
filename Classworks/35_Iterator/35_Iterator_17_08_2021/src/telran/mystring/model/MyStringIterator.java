package telran.mystring.model;

import java.util.Iterator;

public class MyStringIterator implements Iterator<Character> {
	private StringBuilder str;
	private int currPos;
	private int size;

	public MyStringIterator(StringBuilder str) {
		this.str = str;
		currPos = 0;
		size = str.length();
	}

	@Override
	public boolean hasNext() {
		return currPos < size;
	}

	@Override
	public Character next() {
		Character current = str.charAt(currPos);
		currPos++;
		return current;
	}
	
	@Override
	public void remove() {
		str.deleteCharAt(--currPos);
		size--;
	}

}

package telran.mystring.model;

import java.util.Iterator;

public class MyString implements Iterable<Character> {
	private StringBuilder str;

	public MyString() {
		this("");
		// this.str = new StringBuilder("");
	}

	public MyString(CharSequence str) {
		this.str = new StringBuilder(str);
	}

//	public StringBuilder getStr() {
//		return new StringBuilder(str);
//	}

	public void addChar(char c) {
		str.append(c);
	}

	public void removeChar(char c) {
		int index = str.indexOf(Character.toString(c));
		str.deleteCharAt(index);
	}
	
	@Override
	public Iterator<Character> iterator(){
		return new MyStringIterator(str);
	}

	@Override
	public String toString() {
		return str.toString();
	}
	
	

}

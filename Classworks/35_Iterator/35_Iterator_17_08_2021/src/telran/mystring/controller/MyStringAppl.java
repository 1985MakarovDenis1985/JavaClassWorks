package telran.mystring.controller;

import java.util.Iterator;

import telran.mystring.model.MyString;

public class MyStringAppl {

	public static void main(String[] args) {
		MyString myStr = new MyString("Two beer, or not two beer? Sheakesbeer");
		System.out.println(myStr);
		myStr.addChar('.');
		System.out.println(myStr);
		myStr.removeChar(',');
		System.out.println(myStr);
		for (Character c : myStr) {
			System.out.print(Character.toUpperCase(c));
		}
		System.out.println();

		Iterator<Character> iterator = myStr.iterator();
		while (iterator.hasNext()) {
			char c = iterator.next();
			if ("aeiou".contains(c + "")) {
				iterator.remove();
			}
		}
		System.out.println(myStr);

//		NB! Wrong way		
//		for (Character c : myStr) {
//			if(c == 'e') {
//				myStr.removeChar(c);
//			}
//		}
//		System.out.println(myStr);

//		Iterator<Character> iterator = myStr.iterator();
//		while(iterator.hasNext()) {
//			char c = iterator.next();
//			System.out.print(Character.toUpperCase(c));
//		}
//		System.out.println();
//		System.out.println(myStr);

//		StringBuilder builder = myStr.getStr();
//		for(int i = 0; i < builder.length(); i++) {
//			System.out.print(Character.toUpperCase(builder.charAt(i)));
//		}
//		System.out.println();
//		builder.setLength(3);
//		System.out.println(builder);
//		System.out.println(myStr);
	}

}

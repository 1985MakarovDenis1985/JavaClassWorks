package telran.reflection.model;

import java.lang.reflect.Method;

public class Foo {
	public void f1(String str) {
		System.out.println("method f1 " + str);
	}
	
	public void f2(String str) {
		System.out.println("method f2 " + str);
	}
	
	public void f3(String str) {
		System.out.println("method f3 " + str);
	}
	
	private void f1private(String str) {
		System.out.println("method f1private " + str);
	}
	
	public void caller(String functionName, String arg) {
		Class<Foo> clazz = Foo.class;
		try {
			Method method = clazz.getDeclaredMethod(functionName, String.class);
			method.invoke(this, arg);
		} catch (Exception e) {
			System.out.println(functionName + " doesn't exist");
		} 
		
//		switch (functionName) {
//		case "f1":
//			f1(arg);
//			break;
//		case "f2":
//			f2(arg);
//			break;
//		case "f1private":
//			f1private(arg);
//			break;
//		default:
//			System.out.println(functionName + " doesn't exist");
//		}
	}
}

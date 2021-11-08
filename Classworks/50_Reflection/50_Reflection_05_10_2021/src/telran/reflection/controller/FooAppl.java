package telran.reflection.controller;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

import telran.reflection.model.Foo;

public class FooAppl {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		if(args.length != 2){
			System.out.println("Wrong numbers of arguments");
			return;
		}
		Foo foo = new Foo();
		//foo.caller(args[0], args[1]);
		Method method = Foo.class.getDeclaredMethod(args[0], String.class);
		method.setAccessible(true);
		method.invoke(foo, args[1]);
		displayInfo(foo);

	}

	private static void displayInfo(Foo foo) {
		Class<?> clazz = foo.getClass();
		System.out.println("\tProtocol:");
		Method[] protocol = clazz.getMethods();
		Arrays.stream(protocol).forEach(m -> System.out.println(m.getName()));
		System.out.println("\tContract:");
		Method[] contract = clazz.getDeclaredMethods();
		Arrays.stream(contract).forEach(m -> System.out.println(m.getName()));
		
	}

}

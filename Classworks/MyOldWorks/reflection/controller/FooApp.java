package telran.reflection.controller;

import telran.reflection.model.Foo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class FooApp {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        if (args.length != 2) {
            System.out.println("Wrong numbers of argument");
            return;
        }
        Foo foo = new Foo();
//        foo.caller("f2", "Hello");
//
        Method method = Foo.class.getDeclaredMethod(args[0], String.class);
        method.setAccessible(true);
//        method.invoke(foo, args[1]);
        method.invoke(foo, args[1]);

//        displayInfo(foo);
    }

    private static void displayInfo(Foo foo) {
        Class<?> clazz = foo.getClass();
        System.out.println("Protocol: ");
        Method[] protocol = clazz.getMethods(); // protocol -> возвращает все методы + родительские без приватных
        Arrays.stream(protocol).forEach(m -> System.out.println(m.getName()));
        System.out.println("--------");
        System.out.println("Contract: ");
        Method[] contract = clazz.getDeclaredMethods(); // contract -> возврвщает только собственные методы + приватные
        Arrays.stream(contract).forEach(m -> System.out.println(m.getName()));
    }

}

package telran.inheritance.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import telran.inheritance.model.Child;

public class ParentChildAppl {

	public static void main(String[] args) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test"))){
			System.out.println("Creating...");
			Child child = new Child(1);
			child.setParentField(100);
			oos.writeObject(child);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test"))){
			System.out.println("Deserializing...");
			Child child = (Child) ois.readObject();
			System.out.println("child.childField = " + child.getChildField());
			System.out.println("child.parentField = " + child.getParentField());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

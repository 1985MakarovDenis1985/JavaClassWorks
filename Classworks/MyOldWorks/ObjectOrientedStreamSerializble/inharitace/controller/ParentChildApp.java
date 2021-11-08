package inharitace.controller;

import inharitace.model.Child;

import java.io.*;

public class ParentChildApp {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test"))){
            System.out.println("Creating...");
            Child child = new Child(1);
            child.setParentField(100);
            oos.writeObject(child);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test"))){
            System.out.println("Deserializing");
            Child child = (Child) ois.readObject();
            System.out.println("child.childField = " + child.getChildField());
            System.out.println("child.parentField = " + child.getParentField());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

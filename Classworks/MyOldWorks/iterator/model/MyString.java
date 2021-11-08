package iterator.model;

import java.util.Iterator;

public class MyString  implements Iterable <Character>{
    private StringBuilder str;

    public MyString() {
        this(""); // одно и тоже ->
//        this.str = new StringBuilder("");
    }

    public MyString(CharSequence str) {
        this.str = new StringBuilder(str);
    }

    public StringBuilder getStr() {
//        return str;
        return str = new StringBuilder(str);
    }

    public void addChar(char c){
        str.append(c);
    }

    public void removeChar(char c){
//        int index = str.indexOf(c+""); // преобразовуем в строку
        int index = str.indexOf(Character.toString(c)); // можно так
        str.deleteCharAt(index); //-> удаляем первый найденный char
    }

//    public Iterator<Character> iteratorChar(){
//        return new MyStringIterator(str);
//    }

    @Override
    public String toString() {
        return str.toString();
    }

    @Override
    public Iterator<Character> iterator() {
        return new MyStringIterator(str);

    }
}

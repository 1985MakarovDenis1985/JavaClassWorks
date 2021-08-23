package myLinkedList.model;

public interface ILinkedList<E> extends Iterable <E>{
    int size();
    default boolean isEmpty(){
        return size() == 0;
    };
    default boolean contains(Object o){
        return indexOf(o) >= 0;
    };
    int indexOf (Object o);
    int lastIndexOf(Object o);
    E get(int index);
    E set(int index, E element);
    boolean add (E element);
    boolean add (int index, E element);
    E remove(int index);
    default boolean remove(Object o){
        int index = indexOf(o);
        if (index < 0){
            return false;
        }
        remove(index);
        return true;
    };
    void clear();

}

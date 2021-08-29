package interfaces;

public interface ISet<E> extends Iterable<E> {

    boolean add(E elements);

    boolean contains(E elements);

    boolean remove(E elements);

    int size();

}

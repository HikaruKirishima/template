package ar.fiuba.tdd.template;

public class Queue<T> implements IQueue<T> {
    private Node<T> first;
    private int quantity;

    public Queue() {
        quantity = 0;
        first = null;
    }

    public int size() {
        return quantity;
    }

    public boolean isEmpty() {
        return (size( ) == 0);
    }

    public void add(T item) throws AssertionError {
        first.setObject(item);
        quantity++;
    }

    public void remove() throws AssertionError {
        first = first.getNext();

    }

    public T top() throws AssertionError {
        T object = first.getObject();
        remove();
        return object;
    }
}

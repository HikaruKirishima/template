package ar.fiuba.tdd.template;
/*
    Autor : 87525
 */
public class Queue<T> implements IQueue<T> {
    private Node<T> first;
    private int quantity;

    public Queue() {
        quantity = 0;
        first = new Node<>();
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
        try {
            first = first.getNext();
        } catch (Exception e) {
            throw new AssertionError();
        }
    }

    public T top() throws AssertionError {
        T object = first.getObject();
        if ( object != null ) {
            remove();
            return object;
        } else {
            throw new AssertionError();
        }
    }
}

package ar.fiuba.tdd.template;

public class List<T> {
    private Node<T> first;
    private int quantity;

    public List() {
        quantity = 0;
        first = null;
    }

    public int size() {
        return quantity;
    }

    public boolean isEmpty() {
        return (size( ) == 0);
    }

    public void add(T item) {
        increaseQuantity();
        first.setObject(item);
    }

    public void removeHead() throws AssertionError {
        decreaseQuantity();
        first = first.getNext();
    }

    public T getFirst() throws AssertionError {
        decreaseQuantity();
        T object = first.getObject();
        first = first.getNext();
        return object;
    }

    private void decreaseQuantity() throws AssertionError {
        quantity--;
        if (quantity < 0) {
            throw new AssertionError() ;
        }
    }

    private void increaseQuantity() {
        if (quantity == 0 ) {
            first = new Node<>();
        }
        quantity++;
    }
}

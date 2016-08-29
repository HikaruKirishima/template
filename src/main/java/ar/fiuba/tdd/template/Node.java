package ar.fiuba.tdd.template;

public class Node<T> {
    private Node<T> next;
    private T object;

    public Node(T elem) {
        next = null;
        object = elem;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> node) {
        if (next != null) {
            next.setNext(node);
        } else {
            next = node;
        }
    }

    public T getObject() {
        return object;
    }

    public void setObject(T elem) {
        if (object == null) {
            object = elem;
        } else {
            setNext( new Node<>(elem));
        }

    }
}

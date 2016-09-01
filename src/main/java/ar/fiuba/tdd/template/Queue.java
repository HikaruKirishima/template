package ar.fiuba.tdd.template;
/*
    Autor : Elizabeth Solis 87525
 */
public class Queue<T> implements IQueue<T> {
    List<T> list;

    public Queue() {
        list = new List<>();
    }

    public int size() {
        return  list.size();
    }

    public boolean isEmpty() {
        return  list.isEmpty();
    }

    public void add(T item) {
        list.add(item);
    }

    public void remove() throws AssertionError {
        list.removeHead();
    }

    public T top() throws AssertionError {
        return list.getFirst();
    }
}

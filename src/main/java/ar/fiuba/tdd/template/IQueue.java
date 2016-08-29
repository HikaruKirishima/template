package ar.fiuba.tdd.template;

public interface IQueue<T> {
    boolean isEmpty();

    int size();

    void add(T item) throws AssertionError ; //Agregar un item

    void remove() throws AssertionError;//remover el primer item, lanzar exception si esta vacio

    T top() throws AssertionError;//retornar el primer item, lanzar exception si esta vacio
}

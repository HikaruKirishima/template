package ar.fiuba.tdd.template;
/*
    Autor : 87525
 */
public interface IQueue<T> {
    boolean isEmpty();

    int size();

    void add(T item) ; //Agregar un item

    void remove() throws AssertionError;//remover el primer item, lanzar exception si esta vacio

    T top() throws AssertionError;//retornar el primer item, lanzar exception si esta vacio
}

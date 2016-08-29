package ar.fiuba.tdd.template;

import org.junit.Test;
import org.omg.CORBA.Object;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
/*
    Autor : 87525
 */
public class MainTests {

    @Test
    public void dummy() {
        assertEquals(0, 0);
    }

    @Test
    public void testGetFirst() {
        Queue<String> list = new Queue<>();
        list.add("Primer Elemento");
        assertEquals(list.top(), "Primer Elemento");
    }

    @Test
    public void testSecondFirst() {
        Queue<String> list = new Queue<>();
        list.add("Primero");
        list.add("Segundo");
        list.add("Tercero");
        String primero = list.top();
        assertEquals(list.top(), "Segundo");
    }

    @Test(expected = AssertionError.class)
    public void testTopExceptions() throws AssertionError {
        Queue<String> list = new Queue<>();
        String value = list.top();
    }
}

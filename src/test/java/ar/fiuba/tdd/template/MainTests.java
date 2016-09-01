package ar.fiuba.tdd.template;

import org.junit.Test;
import org.omg.CORBA.Object;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
/*
    Autor : 87525
 */
public class MainTests {

    @Test
    public void testGetFirst() {
        Queue<String> queue = new Queue<>();
        queue.add("Primer Elemento");
        assertEquals(queue.top(), "Primer Elemento");
    }

    @Test
    public void testSecondFirst() {
        Queue<String> queue = new Queue<>();
        queue.add("Primero");
        queue.add("Segundo");
        queue.add("Tercero");
        String primero = queue.top();
        assertEquals(queue.top(), "Segundo");
    }

    @Test
    public void testGetQuantity() {
        Queue<String> queue = new Queue<>();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.add("4");
        queue.add("5");
        queue.add("6");
        queue.remove();
        assertEquals(queue.size(),5);
    }

    @Test
    public void testIsEmpthyFalse() {
        Queue<String> queue = new Queue<>();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testIsEmpthyTrue() {
        Queue<String> queue = new Queue<>();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.add("4");
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        assertTrue(queue.isEmpty());
    }

    @Test(expected = AssertionError.class)
    public void testTopExceptions() throws AssertionError {
        Queue<String> queue = new Queue<>();
        String value = queue.top();
    }

    @Test(expected = AssertionError.class)
    public void testEmptyExceptions() throws AssertionError {
        Queue<String> queue = new Queue<>();
        queue.add("Primero");
        assertEquals(queue.top(), "Primero");
        queue.remove(); //ERROR!
    }

    @Test(expected = AssertionError.class)
    public void testEmptyFullQueueExceptions() throws AssertionError {
        Queue<String> queue = new Queue<>();
        queue.add("Primero");
        assertEquals(queue.top(), "Primero");
        queue.add("Segundo");
        assertEquals(queue.top(), "Segundo");

        queue.remove(); //ERROR!
    }
}

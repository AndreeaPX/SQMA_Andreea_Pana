package org.example;

import org.junit.jupiter.api.Test;
import java.util.EmptyStackException;
import static org.junit.jupiter.api.Assertions.*;

public class PeekTest {

    @Test
    public void testPeek() {
        Stack<Integer> stack = new Stack<>(3);
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.peek(), "The element is be 2");
        assertFalse(stack.isEmpty(), "The stack should not be empty after peek");
    }

    @Test
    public void testPeekEmptyStack() {
        Stack<Integer> stack = new Stack<>(3);
        Exception ex = assertThrows(EmptyStackException.class, stack::peek);
        assertNotNull(ex, "Throw EmptyStackException");
    }
}

package org.example;
import org.junit.jupiter.api.Test;
import java.util.EmptyStackException;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    @Test
    public void testPushAndPop(){
        Stack<Integer> stack = new Stack<>(4);
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop(), "LIFO - last in first out -- 2");
        assertEquals(1, stack.pop(), "LIFO - last in first out -- 1");
    }

    @Test
    public void testEmptyStack() {
        Stack<Integer> stack = new Stack<>(4);
        assertTrue(stack.isEmpty(),"The stack should be empty at first");
        stack.push(7);
        assertFalse(stack.isEmpty(),"The stack should not be empty after push");
    }

    @Test
    public void testOverflow(){
        Stack<Integer> stack = new Stack<>(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        Exception ex = assertThrows(IllegalStateException.class, () -> stack.push(5));
        assertEquals("Stack overflow!", ex.getMessage());
    }

    @Test
    public void testUnderflow(){
        Stack<Integer> stack =new Stack<>(4);
        Exception ex = assertThrows(EmptyStackException.class, stack::pop);
    }
}

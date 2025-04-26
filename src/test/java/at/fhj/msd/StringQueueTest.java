package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class StringQueueTest {
    private StringQueue queue;

    @BeforeEach
    void setUp() {
        queue = new StringQueue(3);
    }

    @Test
    void testOfferSuccess() {
        assertTrue(queue.offer("A"));
        assertTrue(queue.offer("B"));
        assertEquals(2, queue.elements.size());
    }

    @Test
    void testOfferQueueFull() {
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        assertFalse(queue.offer("D"));
    }

    @Test
    void testOfferNull() {
        assertFalse(queue.offer(null));
    }

    @Test
    void testPoll() {
        queue.offer("A");
        queue.offer("B");
        assertEquals("A", queue.poll());
        assertEquals(1, queue.elements.size());
        assertEquals("B", queue.poll());
        assertNull(queue.poll());
    }

    @Test
    void testRemove() {
        queue.offer("A");
        assertEquals("A", queue.remove());
        assertThrows(NoSuchElementException.class, () -> queue.remove());
    }

    @Test
    void testPeek() {
        queue.offer("A");
        assertEquals("A", queue.peek());
        assertEquals(1, queue.elements.size());
        queue.poll();
        assertNull(queue.peek());
    }

    @Test
    void testElement() {
        queue.offer("A");
        assertEquals("A", queue.element());
        queue.poll();
        assertThrows(NoSuchElementException.class, () -> queue.element());
    }
}
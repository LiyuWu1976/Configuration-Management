package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class DrinkQueueTest {
    private DrinkQueue queue;
    private SimpleDrink simpleDrink;
    private Cocktail cocktail;

    @BeforeEach
    void setUp() {
        queue = new DrinkQueue(3);
        simpleDrink = new SimpleDrink("Water Drink", new Liquid("Water", 0.5, 0.0));
        cocktail = new Cocktail("Mojito", Arrays.asList(
            new Liquid("Rum", 0.05, 40.0),
            new Liquid("Soda", 0.15, 0.0)
        ));
    }

    @Test
    void testOfferSuccess() {
        assertTrue(queue.offer(simpleDrink));
        assertTrue(queue.offer(cocktail));
        assertEquals(2, queue.elements.size());
    }

    @Test
    void testOfferQueueFull() {
        queue.offer(simpleDrink);
        queue.offer(cocktail);
        queue.offer(simpleDrink);
        assertFalse(queue.offer(cocktail));
    }

    @Test
    void testOfferNull() {
        assertFalse(queue.offer(null));
    }

    @Test
    void testPoll() {
        queue.offer(simpleDrink);
        queue.offer(cocktail);
        assertEquals(simpleDrink, queue.poll());
        assertEquals(1, queue.elements.size());
        assertEquals(cocktail, queue.poll());
        assertNull(queue.poll());
    }

    @Test
    void testRemove() {
        queue.offer(simpleDrink);
        assertEquals(simpleDrink, queue.remove());
        assertThrows(NoSuchElementException.class, () -> queue.remove());
    }

    @Test
    void testPeek() {
        queue.offer(simpleDrink);
        assertEquals(simpleDrink, queue.peek());
        assertEquals(1, queue.elements.size());
        queue.poll();
        assertNull(queue.peek());
    }

    @Test
    void testElement() {
        queue.offer(simpleDrink);
        assertEquals(simpleDrink, queue.element());
        queue.poll();
        assertThrows(NoSuchElementException.class, () -> queue.element());
    }
}
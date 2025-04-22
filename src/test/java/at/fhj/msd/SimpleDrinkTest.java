package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SimpleDrinkTest {
    private SimpleDrink nonAlcoholicDrink;
    private SimpleDrink alcoholicDrink;

    @BeforeEach
    void setUp() {
        Liquid water = new Liquid("Water", 0.5, 0.0);
        Liquid vodka = new Liquid("Vodka", 0.2, 40.0);
        nonAlcoholicDrink = new SimpleDrink("Water Drink", water);
        alcoholicDrink = new SimpleDrink("Vodka Shot", vodka);
    }

    @Test
    void testGetVolume() {
        assertEquals(0.5, nonAlcoholicDrink.getVolume(), 0.001);
        assertEquals(0.2, alcoholicDrink.getVolume(), 0.001);
    }

    @Test
    void testGetAlcoholPercent() {
        assertEquals(0.0, nonAlcoholicDrink.getAlcoholPercent(), 0.001);
        assertEquals(40.0, alcoholicDrink.getAlcoholPercent(), 0.001);
    }

    @Test
    void testIsAlcoholic() {
        assertFalse(nonAlcoholicDrink.isAlcoholic());
        assertTrue(alcoholicDrink.isAlcoholic());
    }

    @Test
    void testGetName() {
        assertEquals("Water Drink", nonAlcoholicDrink.getName());
        assertEquals("Vodka Shot", alcoholicDrink.getName());
    }

    @Test
    void testSetName() {
        nonAlcoholicDrink.setName("New Water Drink");
        assertEquals("New Water Drink", nonAlcoholicDrink.getName());
    }
}
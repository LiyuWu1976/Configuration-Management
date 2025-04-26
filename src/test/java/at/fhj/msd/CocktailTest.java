package at.fhj.msd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CocktailTest {
    private Cocktail cocktail;
    private List<Liquid> liquids;

    @BeforeEach
    void setUp() {
        liquids = Arrays.asList(
            new Liquid("Vodka", 0.05, 40.0),
            new Liquid("Orange Juice", 0.15, 0.0)
        );
        cocktail = new Cocktail("Screwdriver", liquids);
    }
    @Test
    void testName() {
        assertEquals("Screwdriver", cocktail.getName());
    }

    @Test
    void testGetVolume() {
        assertEquals(0.2, cocktail.getVolume(), 0.001);
    }

    @Test
    void testGetAlcoholPercent() {
        // Expected: (0.05 * 40/100) / 0.2 * 100 = 10%
        assertEquals(10.0, cocktail.getAlcoholPercent(), 0.001);
    }

    @Test
    void testIsAlcoholic() {
        assertTrue(cocktail.isAlcoholic());
    }

    @Test
    void testNonAlcoholic() {
        Cocktail juiceMix = new Cocktail("Juice Mix", Arrays.asList(
                new Liquid("Apple Juice", 0.1, 0),
                new Liquid("Orange Juice", 0.1, 0)
        ));

        assertFalse(juiceMix.isAlcoholic());
        assertEquals(0.0, juiceMix.getAlcoholPercent(), 0.0001);
    }

    @Test
    void testEmptyCocktail() {
        Cocktail emptyCocktail = new Cocktail("Empty", Collections.emptyList());
        assertEquals(0.0, emptyCocktail.getVolume(), 0.001);
        assertEquals(0.0, emptyCocktail.getAlcoholPercent(), 0.001);
        assertFalse(emptyCocktail.isAlcoholic());
    }
}
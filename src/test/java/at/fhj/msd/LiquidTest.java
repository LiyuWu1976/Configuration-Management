package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LiquidTest {
    private Liquid liquid;

    @BeforeEach
    void setUp() {
        liquid = new Liquid("Water", 0.5, 0.0);
    }

    @Test
    void testGetName() {
        assertEquals("Water", liquid.getName());
    }

    @Test
    void testSetName() {
        liquid.setName("Juice");
        assertEquals("Juice", liquid.getName());
    }

    @Test
    void testGetVolume() {
        assertEquals(0.5, liquid.getVolume(), 0.001);
    }

    @Test
    void testSetVolume() {
        liquid.setVolume(1.0);
        assertEquals(1.0, liquid.getVolume(), 0.001);
    }

    @Test
    void testGetAlcoholPercent() {
        assertEquals(0.0, liquid.getAlcoholPercent(), 0.001);
    }

    @Test
    void testSetAlcoholPercent() {
        liquid.setAlcoholPercent(40.0);
        assertEquals(40.0, liquid.getAlcoholPercent(), 0.001);
    }

    @Test
    void testConstructor() {
        Liquid newLiquid = new Liquid("Vodka", 0.2, 40.0);
        assertEquals("Vodka", newLiquid.getName());
        assertEquals(0.2, newLiquid.getVolume(), 0.001);
        assertEquals(40.0, newLiquid.getAlcoholPercent(), 0.001);
    }
}
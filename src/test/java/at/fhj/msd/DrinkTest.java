package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DrinkTest {
    private Drink drink;

    @BeforeEach
    void setUp() {
        drink = new Drink("Test Drink") {
            @Override
            public double getVolume() {
                return 0.0;
            }

            @Override
            public double getAlcoholPercent() {
                return 0.0;
            }

            @Override
            public boolean isAlcoholic() {
                return false;
            }
        };
    }

    @Test
    void testGetName() {
        assertEquals("Test Drink", drink.getName());
    }

    @Test
    void testSetName() {
        drink.setName("New Drink");
        assertEquals("New Drink", drink.getName());
    }
}
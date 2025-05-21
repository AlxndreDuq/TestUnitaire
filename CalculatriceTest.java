import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatriceTest {

    @Test
    void addition() {
        assertEquals(10, Calculatrice.addition(4,6));
        assertEquals(-15, Calculatrice.addition(2, -17));
        assertEquals(-22, Calculatrice.addition(-5, -17));
        assertEquals(5, Calculatrice.addition(5, 0));
    }

    @Test
    void soustraction() {
        assertEquals(4, Calculatrice.soustraction(10,6));
        assertEquals(19, Calculatrice.soustraction(2, -17));
        assertEquals(12, Calculatrice.soustraction(-5, -17));
        assertEquals(5, Calculatrice.soustraction(5, 0));
    }

    @Test
    void multiplier() {
        assertEquals(24, Calculatrice.multiplier(4,6));
        assertEquals(-10, Calculatrice.multiplier(2, -5));
        assertEquals(10, Calculatrice.multiplier(-5, -2));
        assertEquals(0, Calculatrice.multiplier(5, 0));
    }

    @Test
    void diviser() {
        assertEquals(5, Calculatrice.diviser(10,2));
        assertEquals(-5, Calculatrice.diviser(10, -2));
        assertEquals(5, Calculatrice.diviser(-10, -2));
        assertEquals(1.5, Calculatrice.diviser(3, 2));
        assertThrows(IllegalArgumentException.class, () -> Calculatrice.diviser(10, 0));
    }
}
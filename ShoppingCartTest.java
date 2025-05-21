import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    @Test
    void creationCart(){
        assertDoesNotThrow(()->{ShoppingCart c = new ShoppingCart();});
    }

    @Test
    void addProduct() {
        ShoppingCart c = new ShoppingCart();

        assertThrows(IllegalArgumentException.class, () -> c.addProduct(null));
        assertDoesNotThrow(() -> c.addProduct(new Product("Pomme", 5.0)));
        assertEquals(1, c.getItemCount());
        assertThrows(IllegalArgumentException.class, () -> c.addProduct(new Product("Pomme", -5.0)));
    }

    @Test
    void getTotalPrice() {
        ShoppingCart c = new ShoppingCart();
        assertDoesNotThrow(() -> c.addProduct(new Product("Pomme", 5.0)));
        assertDoesNotThrow(() -> c.addProduct(new Product("Jouet", 10.0)));
        assertEquals(15.0, c.getTotalPrice());
    }

    @Test
    void clearCart() {
        ShoppingCart c = new ShoppingCart();
        assertDoesNotThrow(() -> c.addProduct(new Product("Pomme", 5.0)));
        assertDoesNotThrow(() -> c.addProduct(new Product("Jouet", 10.0)));
        assertEquals(2, c.getItemCount());
        assertDoesNotThrow(() -> c.clearCart());
        assertEquals(0, c.getItemCount());
    }
}
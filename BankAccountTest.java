import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void createAccount(){
        assertDoesNotThrow(() -> {BankAccount b = new BankAccount("Alexandre", 100);});
        assertThrows(IllegalArgumentException.class, () -> {BankAccount b = new BankAccount("Alexandre", -100);});
    }

    @Test
    void deposit() {
        BankAccount b = new BankAccount("Alexandre", 100);

        assertDoesNotThrow(()->b.deposit(100));
        assertEquals(200, b.getBalance());
        assertThrows(IllegalArgumentException.class, () -> b.deposit(-100));
    }

    @Test
    void withdraw() {
        BankAccount b = new BankAccount("Alexandre", 100);
        assertDoesNotThrow(()->b.withdraw(50));
        assertEquals(50, b.getBalance());
        assertThrows(IllegalArgumentException.class, ()->b.withdraw(500));
        assertThrows(IllegalArgumentException.class, ()->b.withdraw(-10));
    }
}
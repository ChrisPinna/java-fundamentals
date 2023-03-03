package bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {
    @Test
    void testNegativeNumbersError() {
        Account bankAccount = new Account();
        assertThrows(Exception.class ,() -> bankAccount.deposit(-100));
    }
}

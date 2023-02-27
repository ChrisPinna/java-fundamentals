import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void testGenerateListsNumbersUpToOne() {
        FizzBuzz subject = new FizzBuzz();
        String result = subject.generate(1);
        assertEquals("1", result);
        // Note that in JUnit, the expected value comes first
        // This is called 'Yoda Conditions'.
    }

    @Test
    void testGenerateListsNumbersUpToTwo() {
        FizzBuzz subject = new FizzBuzz();
        String result = subject.generate(2);
        assertEquals("1, 2", result);
    }

    @Test
    void testGenerateFizzesAtNumberThree() {
        FizzBuzz subject = new FizzBuzz();
        String result = subject.generate(3);
        assertEquals("1, 2, Fizz", result);
    }

    @Test
    void testGenerateBuzzesAtNumberFive() {
        FizzBuzz subject = new FizzBuzz();
        String result = subject.generate(5);
        assertEquals("1, 2, Fizz, 4, Buzz", result);
    }
}
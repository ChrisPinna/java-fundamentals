package bank.exceptions;

public class NegativeNumberException extends Exception {
    public NegativeNumberException() {
        super("Amount cannot be negative");
    }
}
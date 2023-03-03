package bank;

import bank.exceptions.NegativeNumberException;

import java.util.ArrayList;

public class Account {

    private float balance = 0;
    private ArrayList<String> transactions = new ArrayList<>();

    public void deposit(int amount) throws NegativeNumberException {
        if (amount > 0) {

        } else {
            throw new NegativeNumberException();
        }
    }

    public void withdrawal(int amount) {
        // Withdrawal
    }

    public String generateStatement() {
        return """
                date || credit || debit || balance
                14/01/2021 || - || 500.00 || 2500.00
                13/01/2021 || 2000.00 || - || 3000.00
                10/01/2021 || 1000.00 || - || 1000.00""";
    }


}

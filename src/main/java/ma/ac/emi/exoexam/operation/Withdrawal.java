package ma.ac.emi.exoexam.operation;

import ma.ac.emi.exoexam.Account;

public class Withdrawal extends Operation{
    public Withdrawal(Account account, double amount) {
        super(account, amount);
    }
}

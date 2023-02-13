package ma.ac.emi.exoexam.operation;

import ma.ac.emi.exoexam.Account;

import java.util.Date;
import java.util.Locale;

public class Operation {
    private Account account;
    private double amount;
    private Date date;

    //GETTERS
    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    public Account getAccount(){
        return account;
    }

    //SETTERS
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setAccount(Account account){
        this.account = account;
    }

    //METHODS
    public Operation(Account account, double amount) {
        this.account = account;
        this.amount = amount;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return this.getClass().getName()+" {" +
                "amount=" + amount +
                ", date=" + date +
                '}';
    }
}

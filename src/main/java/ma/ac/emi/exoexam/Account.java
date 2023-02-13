package ma.ac.emi.exoexam;

import ma.ac.emi.exoexam.logger.ILogger;
import ma.ac.emi.exoexam.operation.Deposit;
import ma.ac.emi.exoexam.operation.Operation;
import ma.ac.emi.exoexam.operation.Withdrawal;
import ma.ac.emi.exoexam.service.LoggerService;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int accountId;
    private double balance;
    private List<Operation> operations = new ArrayList<Operation>();

    private List<ILogger> loggers = new ArrayList<ILogger>();

    private LoggerService loggerService;


    //GETTERS
    public int getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public LoggerService getLoggerService() {
        return loggerService;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public List<ILogger> getLoggers() {
        return loggers;
    }

    //SETTERS
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setLoggerService(LoggerService loggerService){
        this.loggerService = loggerService;
    }

    public void addOperation(Operation operation) {
        this.operations.add(operation);
    }

    //CONSTRUCTORS
    public Account(int accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    //METHODS
    public void makeDeposit(double amount){
        Deposit newDeposit = new Deposit(this, amount);
        addOperation(newDeposit);
        setBalance(getBalance()+amount);
        notifyLoggers();
    }

    public void makeWithdrawal(double amount){
        Withdrawal newWithdrawal = new Withdrawal(this, amount);
        addOperation(newWithdrawal);
        setBalance(getBalance()-amount);
        notifyLoggers();
    }

    public void addLogger(ILogger logger){
        getLoggers().add(logger);
    }

    public void notifyLoggers(){
        for (ILogger logger: getLoggers()){
            logger.log(this);
        }
    }
}

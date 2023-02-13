package ma.ac.emi.exoexam;

import ma.ac.emi.exoexam.loggerfactory.LoggerConsoleFactory;
import ma.ac.emi.exoexam.loggerfactory.LoggerFileFactory;
import ma.ac.emi.exoexam.service.LoggerService;

public class BankTest {
    public static void main(String[] args) {
        //create account
        Account account = new Account(45632, 1000.0);

        //set logger service
        //account.setLoggerService(new LoggerService());

        //add loggers
        account.addLogger(LoggerConsoleFactory.getInstance().createLogger());
        account.addLogger(LoggerFileFactory.getInstance().createLogger());

        //make operations
        account.makeDeposit(5000.0);
        account.makeDeposit(1000.0);
        account.makeWithdrawal(2000.0);
        account.makeWithdrawal(100.0);

    }
}

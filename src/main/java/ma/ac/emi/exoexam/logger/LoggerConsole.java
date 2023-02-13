package ma.ac.emi.exoexam.logger;

import ma.ac.emi.exoexam.Account;
import ma.ac.emi.exoexam.operation.Operation;

public class LoggerConsole implements ILogger{
    @Override
    public void log(Account account) {
        for (Operation operation: account.getOperations()){
            System.out.println(operation);
        }
    }
}

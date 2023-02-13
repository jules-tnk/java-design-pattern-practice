package ma.ac.emi.exoexam.logger;

import ma.ac.emi.exoexam.Account;
import ma.ac.emi.exoexam.operation.Operation;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class LoggerFile implements ILogger{

    @Override
    public void log(Account account){
        String loggerFileName = "log_"+account.getAccountId()+".txt";
        PrintWriter pw = createPrintWriter(loggerFileName);
        StringBuilder sb = new StringBuilder(account.getAccountId() + " " + account.getBalance());
        for (Operation operation: account.getOperations()) {
            sb.append("\n");
            sb.append(operation);
        }
        pw.println(sb.toString());
        pw.close();
    }

    private PrintWriter createPrintWriter(String fileName){
        try {
            return new PrintWriter(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}

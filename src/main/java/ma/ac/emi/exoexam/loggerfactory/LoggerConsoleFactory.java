package ma.ac.emi.exoexam.loggerfactory;

import ma.ac.emi.exoexam.logger.ILogger;
import ma.ac.emi.exoexam.logger.LoggerConsole;

public class LoggerConsoleFactory extends LoggerFactory{

    private static LoggerConsoleFactory instance = null;

    private LoggerConsoleFactory(){}

    public static LoggerConsoleFactory getInstance() {
        if (instance==null){
            instance = new LoggerConsoleFactory();
        }
        return instance;
    }

    @Override
    public ILogger fabricateLogger() {
        return new LoggerConsole();
    }
}

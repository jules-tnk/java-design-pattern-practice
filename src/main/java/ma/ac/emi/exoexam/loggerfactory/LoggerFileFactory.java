package ma.ac.emi.exoexam.loggerfactory;

import ma.ac.emi.exoexam.logger.ILogger;
import ma.ac.emi.exoexam.logger.LoggerFile;

public class LoggerFileFactory extends LoggerFactory{

    private static LoggerFileFactory instance = null;

    private LoggerFileFactory(){}

    public static LoggerFileFactory getInstance() {
        if (instance==null){
            instance = new LoggerFileFactory();
        }
        return instance;
    }
    @Override
    public ILogger fabricateLogger() {
        return new LoggerFile();
    }
}

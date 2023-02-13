package ma.ac.emi.exoexam.service;

import ma.ac.emi.exoexam.Account;
import ma.ac.emi.exoexam.logger.ILogger;

public class LoggerService {
    private ILogger logger;

    public ILogger getLogger() {
        return logger;
    }

    public void setLogger(ILogger logger) {
        this.logger = logger;
    }

    public void log(Account account) {
        logger.log(account);
    }
}

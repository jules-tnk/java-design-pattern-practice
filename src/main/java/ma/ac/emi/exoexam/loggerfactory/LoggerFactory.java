package ma.ac.emi.exoexam.loggerfactory;

import ma.ac.emi.exoexam.logger.ILogger;

public abstract class LoggerFactory {
    public ILogger createLogger(){
        return fabricateLogger();
    }

    protected abstract ILogger fabricateLogger();
}

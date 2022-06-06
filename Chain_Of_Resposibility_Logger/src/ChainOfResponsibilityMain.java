public class ChainOfResponsibilityMain {

    private static AbstractLogger getLoggerChain(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.errorLogger);
        AbstractLogger waringLogger = new WarningLogger(AbstractLogger.warningLogger);
        AbstractLogger normalLogger = new NormalLogger(AbstractLogger.normalLogger);

        errorLogger.setNextLogger(waringLogger);
        waringLogger.setNextLogger(normalLogger);

        return errorLogger;

    }

    public static void main(String[] args) {
        AbstractLogger logger = getLoggerChain();

        logger.logMessage(AbstractLogger.normalLogger,"This is a normal log message");

        logger.logMessage(AbstractLogger.warningLogger,"This is a warning logger message");

        logger.logMessage(AbstractLogger.errorLogger,"This is an error log message");
    }
}

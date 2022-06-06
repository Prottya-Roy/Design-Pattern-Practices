public abstract class AbstractLogger {
    public static int normalLogger = 1;
    public static int warningLogger =2;
    public static int errorLogger =3;

    protected int loggerLevel;

    protected AbstractLogger nextLogger;
    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger=nextLogger;
    }

    public void logMessage(int loggerLevel, String message){
        if(this.loggerLevel<=loggerLevel){
            write(message);
        }
        if (nextLogger!=null){
            nextLogger.logMessage(loggerLevel,message);
        }
    }

    abstract protected void write(String message);
}

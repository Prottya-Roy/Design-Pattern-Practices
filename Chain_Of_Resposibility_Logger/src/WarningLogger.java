public class WarningLogger extends AbstractLogger{

    public WarningLogger(int loggerLevel){
        this.loggerLevel=loggerLevel;
    }

    @Override
    protected void write(String message) {
        System.out.println("Warning Logger Level:: Log message : "+message);
    }
}

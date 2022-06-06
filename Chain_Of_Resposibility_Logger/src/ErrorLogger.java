public class ErrorLogger extends AbstractLogger{
    public ErrorLogger(int loggerLevel){
        this.loggerLevel=loggerLevel;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Logger Level:: Log message : "+message);
    }
}

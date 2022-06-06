public class NormalLogger extends AbstractLogger{

    public NormalLogger(int loggerLevel){
        this.loggerLevel=loggerLevel;
    }

    @Override
    protected void write(String message) {

        System.out.println("Normal Logger Level:: Log message : "+message);
        System.out.println("");
    }
}

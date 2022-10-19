package Hw3.logger;

public class MailLogger implements ILogger{
    @Override
    public void log(String message) {
        System.out.println("Maille Loglandı : " + message);
    }
}

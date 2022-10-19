package Hw3.logger;

public class DatabaseLogger implements ILogger{
    @Override
    public void log(String message) {
        System.out.println("Veritabanına Loglandı : " + message);
    }
}

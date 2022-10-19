package Hw3.logger;

public class FileLogger implements ILogger{
    @Override
    public void log(String message) {
        System.out.println("Dosyaya Loglandı : " + message);
    }
}

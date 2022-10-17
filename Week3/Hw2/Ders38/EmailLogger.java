package Hw2.Ders38;

public class EmailLogger extends BaseLogger{
    @Override
    public void log(String message) {
        System.out.println("Logged to Mail : " + message);
    }
}

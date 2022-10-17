package Hw2.Ders38;

public class Ders38 {

    public static void main(String[] args) {
//        BaseLogger logger = new DatabaseLogger();
//        logger.Log("Log mesajı");
//        BaseLogger [] loggers = new BaseLogger[]{ new FileLogger(),new EmailLogger(),new DatabaseLogger(), new ConsoleLogger()};
//
//        for (BaseLogger logger : loggers){
//            logger.Log("Log mesajı");
//        }
        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();
    }
}

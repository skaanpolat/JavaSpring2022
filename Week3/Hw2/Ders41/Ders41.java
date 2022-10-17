package Hw2.Ders41;

public class Ders41 {

    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();

        customerManager.databaseManager = new MySqlDatabaseManager();
        customerManager.getCustomers();
    }
}

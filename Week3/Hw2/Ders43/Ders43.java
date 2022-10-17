package Hw2.Ders43;

public class Ders43 {

    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());

        customerManager.add();


    }
}

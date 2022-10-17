package Hw1;

public class Main {
    public static void main(String[] args) {

//        //Değer tip
//        int sayi1 = 10;
//        int sayi2 = 20;
//        sayi1 = sayi2;
//        sayi2 = 100;
//        System.out.println(sayi1);
//
//
//        //Referans Tip
//        int[] sayilar1 = new int[] {1,2,3};
//        int[] sayilar2 = new int[]{10,20,30};
//
//        sayilar1 = sayilar2;
//        sayilar2[0] = 1000;
//
//        System.out.println(sayilar1[0]);
//
//        CreditManager creditManager = new CreditManager();
//        creditManager.Calculate();
//        creditManager.Calculate();
//        creditManager.Save();
//
//        Customer customer = new Customer();
//        customer.id=1;
//        customer.city="Ankara";
//
//        CustomerManager customerManager = new CustomerManager(customer);
//        customerManager.Save();
//        customerManager.Delete();
//
//        Company company = new Company();
//        company.taxNumber = "10000000";
//        company.companyName = "Arçelik";
//        company.id= 100;
//
//        CustomerManager customerManager2 = new CustomerManager(new Person());
//
//
//        Person person = new Person();
//        person.firstName = "";
//        person.nationalID = "123423450";
//
//        Customer c1 = new Customer();
//        Customer c2 = new Person();
//        Customer c3 = new Company();

        CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());

        customerManager.GiveCredit();




    }

    static class CreditManager{

        public void Calculate(){
            System.out.println("Hesaplandı");
        }
        public void Save(){
            System.out.println("Kredi Verildi");
        }
    }

    static class Customer{
        public int id;
        public String nationalIdentity;
        public String city;

        public Customer(){
            System.out.println("Müşteri nesnesi başlatıldı");
        }

    }

    static class CustomerManager{

        private Customer _customer;
        ICreditManager _creditManager;

        public CustomerManager(Customer customer, ICreditManager creditManager){
            _customer = customer;
            _creditManager = creditManager;
        }

        public void Save(){
            System.out.println("Müşteri Kaydedildi ");
        }

        public void Delete(){
            System.out.println("Müşteri Silindi " );
        }

        public void GiveCredit(){
            _creditManager.Calculate();
            System.out.println("Kredi verildi");
        }

    }

    interface ICreditManager{
        void Calculate();
        void Save();
    }

    abstract static class BaseCreditManager implements ICreditManager{

        public abstract void Calculate();

        public void Save() {
            System.out.println("Kaydedildi");
        }
    }

    static class TeacherCreditManager extends BaseCreditManager implements ICreditManager{

        @Override
        public void Calculate() {
            System.out.println("Öğretmen kredisi hesaplandı");
        }

        @Override
        public void Save() {
            //
            super.Save();
            //
        }
    }

    static class MilitaryCreditManager extends BaseCreditManager implements ICreditManager{

        @Override
        public void Calculate() {
            System.out.println("Asker kredisi hesaplandı");

        }
        //DRY

    }

    static class Person extends Customer{
        public String firstName;
        public String lastName;
        public String nationalID;
    }

    static class Company extends Customer{
        public String taxNumber;
        public String companyName;
    }


}

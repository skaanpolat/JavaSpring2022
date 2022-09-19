package Ders9;

public class Main {

    public static void main(String[] args) {
        //RecapDemo1
        int sayi1;
        int sayi2;
        int sayi3;

        sayi1 = 15;
        sayi2 = 25;
        sayi3 = 2;

        int EB = sayi1;

        if(EB<sayi2){
            EB = sayi2;
        }
        if(EB<sayi3){
            EB = sayi3;
        }
        System.out.println( "En büyük sayı = " + EB);

    }
}

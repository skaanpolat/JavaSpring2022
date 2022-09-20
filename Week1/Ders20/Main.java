package Ders20;

public class Main {

    public static void main(String[] args) {

        char harf = 'A';

        switch (harf) {

            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(harf + " Kalın seslidir");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println(harf + " İnce seslidir");
                break;
            default:
                System.out.println("Sesli harf girmediniz!");

        }


    }
}

package Ders23;

public class Main {

    public static void main(String[] args) {

        int[] sayilar = new int[]{1, 2, 3, 4, 5, 6, 7, 9, 0};
        int aranacak = 6;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;

            }
        }
        if(varMi==true){
            System.out.println("Sayı dizide var.");
        }
        if(varMi==false){
            System.out.println("Sayı dizide yok.");
        }

    }
}

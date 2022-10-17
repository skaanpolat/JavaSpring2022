package Hw2.Ders39;

import java.util.Arrays;

public class Ders39 {
    public static void main(String[] args) {

        BaseKrediManager[] krediManagers = new BaseKrediManager[]{ new OgretmenKrediManager(),new TarimKrediManager(),new OgrenciKrediManager()};

        for (BaseKrediManager krediManager : krediManagers){
            System.out.println(krediManager.hesapla(1000));
        }
    }
}

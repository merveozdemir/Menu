package com.uniyaz;

public class MenuIslemleri {

    void cumleyiTersYaz(String cumle) {
        String yeniCumle = "";
        int sonIndex = cumle.length() - 1;
        for (int i = 0; i <= sonIndex; i++) {
            yeniCumle += cumle.charAt(sonIndex - i);
        }
        System.out.println(yeniCumle);
    }

    void sekliCiz(int yildizLimit) {
        for (int i = 0; i < yildizLimit; i++) {
            for (int j = 0; j < yildizLimit; j++) {
                if (i != 0) {
                    System.out.print(" * ");
                    break;
                }
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    void araliktakileriGetir(String cumle, int baslangic, int bitis) {
        String substringCumle = cumle.substring(baslangic, bitis);
        System.out.println(substringCumle);
    }

    void tekSayilariYazdir(int sonSayi) {
        for (int i = 0; i < sonSayi; i++) {
            if (i % 2 != 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

    }

    void ciftSayilariYazdir(int sonSayi) {
        for (int i = 0; i < sonSayi; i++) {
            if (i % 2 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}

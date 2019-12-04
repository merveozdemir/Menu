package com.uniyaz;

import java.util.Scanner;

public class MenuUygulama {
    public static void main(String[] args) {
        int durdurmaKriteri = 1;
        Scanner input = new Scanner(System.in);
        MenuIslemleri menuIslem = new MenuIslemleri();

        while(durdurmaKriteri == 1){
            System.out.println("\"----------Ne yapmak istediğinizi seçiniz---------- \n" +
                                "'1.Cümleyi Tersten Yaz', \n" +
                                "'2.Şekil Çiz',\n" +
                                "'3.Cümlenin belli aralığını seç', \n" +
                                "'4.Girilen sayıya kadar tek sayıları yazdır',\n" +
                                "'5.Girilen sayıya kadar çift sayıları yazdır' \n" +
                                "'6.Çıkış'\n"+
                                "-------------------------------------------------- ");
            int request = input.nextInt();
            input.nextLine();

            if(request == 1) {
                System.out.print("Lütfen  tersten yazdırmak istediğiniz cümleyi giriniz: ");
                String cumle = input.nextLine();

                menuIslem.cumleyiTersYaz(cumle);
            }
            else if (request == 2) {
                System.out.print("Lütfen çizdirmek istediğiniz yıldız sayısını giriniz: ");
                int yildizLimit = input.nextInt();

                menuIslem.sekliCiz(yildizLimit);
            }
            else if (request == 3) {
                System.out.print("Lütfen istediğiniz cümleyi giriniz: ");
                String cumle = input.nextLine();

                System.out.println("Lütfen başlangıç aralığını giriniz: ");
                int baslangic = input.nextInt();

                System.out.println("Lütfen bitiş aralığını giriniz: ");
                int bitis = input.nextInt();

                menuIslem.araliktakileriGetir(cumle, baslangic,bitis);
            }
            else if(request == 4) {
                System.out.print("Lütfen sayıyı giriniz: ");
                int sayi = input.nextInt();

                menuIslem.tekSayilariYazdir(sayi);
            }
            else if(request == 5){
                System.out.print("Lütfen sayıyı giriniz: ");
                int sayi = input.nextInt();

                menuIslem.ciftSayilariYazdir(sayi);
            }
            else if (request == 6) {
                durdurmaKriteri = 0;
                input.close();
            }


        }
    }
}

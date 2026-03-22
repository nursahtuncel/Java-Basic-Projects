package Proje04_VucutKitleIndeksi;

import java.util.Scanner;

//Java ile kullanıcıdan boy ve kilo değerlerini alarak aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
public class Proje {
    static void main() {

        double boy,kilo,index;
        Scanner input =new Scanner(System.in);
        System.out.println("Boyunuzu Giriniz:");
        boy= input.nextDouble();
        System.out.println("Kilonuzu Giriniz");
        kilo= input.nextDouble();
        index= kilo /(boy*boy);

        System.out.println("Vücut Kitle İndeksiniz:"+index);

    }
}

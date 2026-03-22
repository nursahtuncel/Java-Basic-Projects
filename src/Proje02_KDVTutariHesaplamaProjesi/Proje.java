package Proje02_KDVTutariHesaplamaProjesi;

//Java dili ile kullanıcıdan alınan tutarın KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
//
//(Not : KDV tutarını 18% olarak alın)

import java.util.Scanner;

public class Proje {
    static void main() {

        double tutar,kdvliTutar;


        Scanner input = new Scanner(System.in);
    System.out.println("Tutar Giriniz");
    tutar = input.nextDouble();
    kdvliTutar= tutar/100*18;
        System.out.println("KDV Oranı: %18");
        System.out.println("KDV Tutarı:"+ kdvliTutar);


}
}
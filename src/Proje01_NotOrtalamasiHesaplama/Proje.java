package Proje01_NotOrtalamasiHesaplama;


import java.util.Scanner;

//Java ile Fizik, Matematik, Türkçe, Kimya, Müzik, Tarih derslerinin sınav puanlarını kullanıcıdan alan ve bu derslerin ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
//Bu programa geliştirme olarak If ve Else kullanmadan, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
public class Proje {
    static void main() {

int fizik,matematik, turkce,kimya,muzik,tarih;
double sonuc;

        Scanner input = new Scanner(System.in);
        System.out.print("Fizik notunuz: ");
        fizik= input.nextInt();

        System.out.print("Matematik notunuz: ");
        matematik= input.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce= input.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya= input.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik= input.nextInt();


        System.out.print("Tarih notunuz: ");
        tarih= input.nextInt();



sonuc= (fizik+kimya+turkce+tarih+matematik+muzik) /6;
            System.out.println("ortalamanız :"+sonuc);






    }

}

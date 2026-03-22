package Proje03_HipotenusHesaplama;

import java.util.Scanner;

//Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve üçgene ait Hipotenüsü hesaplayan programı yazın.
public class Proje {
    static void main() {

        double kenar1,kenar2,hipotenus;
        Scanner input = new Scanner(System.in);
        System.out.println("Kenarı Giriniz");
        kenar1= input.nextInt();

        System.out.println("Kenarı Giriniz");
        kenar2=input.nextInt();

        // Formül: c = karekök(a^2 + b^2)
        double c = Math.sqrt(Math.pow(kenar1, 2) + Math.pow(kenar2, 2));

        System.out.println("Hipotenüs uzunluğu: " + c);

    }
}

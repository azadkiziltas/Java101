package pratik.HesapMakinesi;

import java.util.Scanner;

public class HesapMakinesi {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int secim, sayi1, sayi2;
    System.out.print("Lütfen İlk Sayıyı Giriniz: ");
    sayi1 = scan.nextInt();
    System.out.print("İkinci Sayıyı Giriniz: ");
    sayi2 = scan.nextInt();
    System.out.println(
      "Hangi işlemi Yapmak İstiyorsunuz?\n1-Toplama\n2-Çıkarma\n3-Bölme\n4-Çarpma"
    );

    System.out.print("Seçiminiz : ");
    secim = scan.nextInt();
    switch (secim) {
      case 1:
        System.out.println("Sonuç : " + (sayi1 + sayi2));
        break;
      case 2:
        System.out.println("Sonuç : " + (sayi1 - sayi2));
        break;
      case 3:
        System.out.println("Sonuç : " + (sayi1 / sayi2));
        break;
      case 4:
        System.out.println("Sonuç : " + (sayi1 * sayi2));
        break;
      default:
        System.out.println("Yanlış Seçim Yaptınız");
    }
    scan.close();
  }
}

package pratik.AdvancedCalculator;

import java.util.Scanner;

public class AdvancedCalculator {

  static Scanner scan = new Scanner(System.in);

  static void mod() {
    int number, mod;
    System.out.print("Modu alıncak sayı : ");
    number = scan.nextInt();
    System.out.print("Mod değeri : ");
    mod = scan.nextInt();
    int result = number % mod;
    System.out.println("Sonuç : " + result);
  }

  static void rectangularArea() {
    int a, b;
    System.out.print("a kenarı : ");
    a = scan.nextInt();
    System.out.print("b kenarı : ");
    b = scan.nextInt();
    int result = a * b;
    System.out.println("Sonuç : " + result);
  }

  static void rectangularPerimeter() {
    int a, b;
    System.out.print("a kenarı : ");
    a = scan.nextInt();
    System.out.print("b kenarı : ");
    b = scan.nextInt();
    int result = 2 * (a + b);
    System.out.println("Sonuç : " + result);
  }

  public static void main(String[] args) {
    int select;
    String menu =
      "1- Mod Bul\n" +
      "2- Dikdörtgen Alan Bul\n" +
      "3- Dikdörtgen Çevre Bul\n" +
      "0- Çıkış Yap";

    do {
      System.out.println(menu);
      System.out.print("Lütfen bir işlem seçiniz :");
      select = scan.nextInt();
      switch (select) {
        case 1:
          mod();
          break;
        case 2:
          rectangularArea();
          break;
        case 3:
          rectangularPerimeter();
          break;
        case 0:
          break;
        default:
          System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
      }
    } while (select != 0);
  }
}

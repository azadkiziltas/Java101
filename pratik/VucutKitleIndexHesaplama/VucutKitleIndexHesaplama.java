package pratik.VucutKitleIndexHesaplama;

import java.util.Scanner;

public class VucutKitleIndexHesaplama {

  public static void main(String[] args) {
    double index, kilo, boy;
    Scanner scan = new Scanner(System.in);
    System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
    boy = scan.nextDouble();
    System.out.print("Lütfen kilonuzu giriniz : ");
    kilo = scan.nextDouble();
    index = boy * boy * kilo;
    System.out.println("Vücut Kitle İndeksiniz : " + index);
    scan.close();
  }
}

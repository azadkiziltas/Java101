package pratik.ArtikYil;

import java.util.Scanner;

public class ArtikYil {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Yıl giriniz: ");
    int years = scan.nextInt();
    scan.close();
    if (years % 4 == 0 || years % 100 == 0 && years % 400 == 0) {
      System.out.println(years + " bir artık yıldır");
    } else {
      System.out.println(years + " bir artık yıl değildir");
    }
  }
}

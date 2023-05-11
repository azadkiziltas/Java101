package pratik.ManavKasaProgrami;

import java.util.Scanner;

public class ManavKasaProgrami {

  public static void main(String[] args) {
    double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat =
      0.95, patlicanFiyat = 5.00, toplam;

    double armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;
    Scanner scan = new Scanner(System.in);

    System.out.print("Armut Kaç kilo? : ");
    armutKilo = scan.nextDouble();
    System.out.print("Elma Kaç kilo? : ");
    elmaKilo = scan.nextDouble();
    System.out.print("Domates Kaç kilo? : ");
    domatesKilo = scan.nextDouble();
    System.out.print("Muz Kaç kilo? : ");
    muzKilo = scan.nextDouble();
    System.out.print("Parlican Kaç kilo? : ");
    patlicanKilo = scan.nextDouble();
    toplam =
      (armutFiyat * armutKilo) +
      (elmaFiyat * elmaKilo) +
      (domatesFiyat * domatesKilo) +
      (muzFiyat * muzKilo) +
      (patlicanFiyat * patlicanKilo);
    System.out.print("Toplam Fiyat : " + toplam);
    scan.close();
  }
}

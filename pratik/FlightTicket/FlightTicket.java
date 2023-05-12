package pratik.FlightTicket;

import java.util.Scanner;

public class FlightTicket {

  public static void main(String[] args) {
    int mesafe, yas, yolculukTipi;
    double ucret;
    System.out.println("Tek yön (1)");
    System.out.println("Gidiş-Dönüş (2)");
    System.out.print("Yolculuk tipi seçiniz: ");
    Scanner scan = new Scanner(System.in);
    yolculukTipi = scan.nextInt();
    System.out.print("Mesafe: ");
    mesafe = scan.nextInt();
    System.out.print("Yaş: ");
    yas = scan.nextInt();
    ucret = mesafe * 0.10;
    if (yas < 12) {
      ucret = ucret * 0.50;
    } else if (yas <= 24 && yas >= 12) {
      ucret = ucret - (ucret * 0.10);
    } else if (yas > 65) {
      ucret = ucret - (ucret * 0.30);
    }
    if (mesafe > 0 && ((yolculukTipi == 1) || (yolculukTipi == 2))) {
      if (yolculukTipi == 1) {
        System.out.printf("Bilet Fiyatı %.1f TL", ucret);
      } else if (yolculukTipi == 2) {
        ucret = (ucret - (ucret * 0.20)) * 2;
        System.out.printf("Bilet Fiyatı %.1f TL", ucret);
      }
    } else {
      System.out.println("Hatalı Veri Girdiniz !");
    }

    scan.close();
  }
}

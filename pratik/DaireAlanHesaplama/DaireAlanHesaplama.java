package pratik.DaireAlanHesaplama;

import java.util.Scanner;

public class DaireAlanHesaplama {

  public static void main(String[] args) {
    int r;
    double alan, cevre, x, xAlan;
    Scanner scan = new Scanner(System.in);
    System.out.printf("Dairenin yarıçapını girin : ");
    r = scan.nextInt();
    System.out.printf("a değerini girin : ");
    x = scan.nextInt();

    alan = 3.14 * r * r;
    xAlan = alan * x / 360;
    cevre = 2 * 3.14 * r;

    System.out.printf("Darirenin alanı : %.3f\n", alan);
    System.out.printf("Darirenin çevresi : %.3f\n", cevre);
    System.out.printf("a açılı kısımın alanı : %.3f", xAlan);
    scan.close();
  }
}

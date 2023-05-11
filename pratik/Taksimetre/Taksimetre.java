package pratik.Taksimetre;

import java.util.Scanner;

public class Taksimetre {

  public static void main(String[] args) {
    double mesafe, ucret;
    System.out.print("Mesafe girin : ");
    Scanner scan = new Scanner(System.in);
    mesafe = scan.nextDouble();
    ucret = 10 + 2.2 * mesafe;
    if (ucret < 20) {
      System.out.println("Ücret : 20 TL");
    } else {
      System.out.printf("Ücret : %.3f TL", ucret);
    }
    scan.close();
  }
}

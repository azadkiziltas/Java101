package pratik.DersGecmeDurumu;

import java.util.Scanner;

public class DersGecmeDurumu {

  public static void main(String[] args) {
    int matematik;
    Scanner scan = new Scanner(System.in);
    System.out.print("Matematik notunuz : ");
    matematik = scan.nextInt();
    if (matematik < 55 && matematik >= 0) {
      System.out.println("Matematik dersinden kaldınız.");
    } else if (matematik < 101 && matematik > 54) {
      System.out.println("Matematik dersinden geçtiniz.");
    } else {
      System.out.println("Matematik notunuz yanlış.");
    }
    scan.close();
  }
}

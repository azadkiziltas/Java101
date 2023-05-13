package pratik.RecursiveExponentialNumber;

import java.util.Scanner;

public class RecursiveExponentialNumber {

  static int exponentialNumber(int number, int pow) {
    if (pow == 0) {
      return 1;
    }

    return number * exponentialNumber(number, pow - 1);
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Taban değeri : ");
    int number = scan.nextInt();
    System.out.print("Üs değeri : ");
    int pow = scan.nextInt();
    scan.close();
    System.out.println("Sonuç : " + exponentialNumber(number, pow));
  }
}

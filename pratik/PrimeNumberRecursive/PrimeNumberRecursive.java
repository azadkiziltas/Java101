package pratik.PrimeNumberRecursive;

import java.util.Scanner;

public class PrimeNumberRecursive {

  static int number;

  static boolean isPrime(int x) {
    if (number % x == 0) {
      return false;
    }
    if (x == 2) {
      return true;
    }
    return isPrime(x - 1);
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Bir sayı girin : ");
    number = scan.nextInt();
    System.out.println(isPrime(number - 1));
    scan.close();
  }
}

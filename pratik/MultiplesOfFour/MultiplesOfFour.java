package pratik.MultiplesOfFour;

import java.util.Scanner;

public class MultiplesOfFour {

  public static void main(String[] args) {
    boolean bool = true;
    int number, sum = 0;
    Scanner scan = new Scanner(System.in);
    while (bool) {
      System.out.print("Sayı girin : ");
      number = scan.nextInt();
      if (number % 2 == 1) {
        bool = false;
      }
      if (number % 4 == 0) {
        sum += number;
      }
    }
    System.out.println("4'ün katı olan sayıların toplamı : " + sum);
    scan.close();
  }
}

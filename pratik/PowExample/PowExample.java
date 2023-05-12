package pratik.PowExample;

import java.util.Scanner;

public class PowExample {

  public static void main(String[] args) {
    double powOfFour = 0, powOfFive = 0;
    int number, i = 0;

    Scanner scan = new Scanner(System.in);
    System.out.println("Bir sayı girin : ");
    number = scan.nextInt();
    scan.close();
    while (powOfFour < number || powOfFive < number) {
      System.out.print("");
      powOfFour = Math.pow(4, i);
      powOfFive = Math.pow(5, i);
      if (powOfFour < number) {
        System.out.printf("4^%d : %.0f\n", i, powOfFour);
      }
      if (powOfFive < number) {
        System.out.printf("5^%d : %.0f\n", i, powOfFive);
      }
      i++;
    }
  }
}

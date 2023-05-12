package pratik.PowWithFor;

import java.util.Scanner;

public class PowWithFor {

  public static void main(String[] args) {
    int number, power, answer = 1;
    Scanner scan = new Scanner(System.in);
    System.out.print("Sayı Girin : ");
    number = scan.nextInt();
    System.out.print("Üs Girin : ");
    power = scan.nextInt();
    scan.close();
    for (int i = 0; i < power; i++) {
      answer *= number;
    }
    System.out.printf("%d^%d : %d", number, power, answer);
  }
}

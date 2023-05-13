package pratik.MaxMinNumber;

import java.util.Scanner;

public class MaxMinNumber {

  public static void main(String[] args) {
    int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, number, input;
    Scanner scan = new Scanner(System.in);
    System.out.print("Kaç tane sayı gireceksiniz : ");
    number = scan.nextInt();

    for (int i = 0; i < number; i++) {
      System.out.printf("%d. Sayı : ", i + 1);
      input = scan.nextInt();
      if (max < input) {
        max = input;
      }
      if (min > input) {
        min = input;
      }
    }
    System.out.println("Max Number : " + max);
    System.out.println("Min Number : " + min);
    scan.close();
  }
}

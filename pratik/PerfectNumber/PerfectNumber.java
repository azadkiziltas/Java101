package pratik.PerfectNumber;

import java.util.Scanner;

public class PerfectNumber {

  public static void main(String[] args) {
    int number, sum = 0;
    Scanner scan = new Scanner(System.in);
    System.out.print("Bir Sayı girin : ");
    number = scan.nextInt();
    for (int i = 1; i < number; i++) {
      if (number % i == 0) {
        sum += i;
      }
    }
    if (sum == number) {
      System.out.printf("%d sayısı Mükemmel sayıdır.", number);
    } else {
      System.out.printf("%d sayısı Mükemmel sayı değildir.", number);
    }

    scan.close();
  }
}

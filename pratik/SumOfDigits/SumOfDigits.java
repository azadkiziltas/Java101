package pratik.SumOfDigits;

import java.util.Scanner;

public class SumOfDigits {

  public static void main(String[] args) {
    int sum = 0, number, tempNumber;
    Scanner scan = new Scanner(System.in);
    System.out.print("Bir sayı girin : ");
    number = scan.nextInt();
    scan.close();

    while (number > 0) {
      tempNumber = number % 10;
      sum += tempNumber;
      number -= tempNumber;
      number = number / 10;
    }
    System.out.println("Sum of digits : " + sum);
  }
}

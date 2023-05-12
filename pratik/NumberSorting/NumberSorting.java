package pratik.NumberSorting;

import java.util.Scanner;

public class NumberSorting {

  public static void main(String[] args) {
    int num1, num2, num3;
    Scanner scan = new Scanner(System.in);

    System.out.print("1. Sayıyı girin: ");
    num1 = scan.nextInt();
    System.out.print("2. Sayıyı girin: ");
    num2 = scan.nextInt();
    System.out.print("3. Sayıyı girin: ");
    num3 = scan.nextInt();
    if (num1 > num2 && num1 > num3 && num2 > num3) {
      System.out.println(num1 + ">" + num2 + ">" + num3);
    } else if (num1 > num2 && num1 > num3 && num3 > num2) {
      System.out.println(num1 + ">" + num3 + ">" + num2);
    } else if (num2 > num1 && num2 > num3 && num1 > num3) {
      System.out.println(num2 + ">" + num1 + ">" + num3);
    } else if (num2 > num1 && num2 > num3 && num3 > num1) {
      System.out.println(num2 + ">" + num3 + ">" + num1);
    } else if (num3 > num1 && num3 > num2 && num1 > num2) {
      System.out.println(num3 + ">" + num1 + ">" + num2);
    } else {
      System.out.println(num3 + ">" + num2 + ">" + num1);
    }
    scan.close();
  }
}

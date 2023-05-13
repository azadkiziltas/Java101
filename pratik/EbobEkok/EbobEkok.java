package pratik.EbobEkok;

import java.util.Scanner;

public class EbobEkok {

  public static void main(String[] args) {
    int i = 1, ebob = 0, ekok, number1, number2;
    Scanner scan = new Scanner(System.in);
    System.out.print("Sayı 1 : ");
    number1 = scan.nextInt();
    System.out.print("Sayı 2 : ");
    number2 = scan.nextInt();

    while (i <= number1) {
      if (number1 % i == 0 && number2 % i == 0) {
        ebob = i;
      }
      i++;
    }
    ekok = number1*number2/ebob;
    System.out.println("Ebob : "+ebob);
    System.out.println("Ekok : "+ekok);
  }
}

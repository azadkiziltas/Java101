package pratik.EvenNumbers;

import java.util.Scanner;

public class EvenNumbers {

  public static void main(String[] args) {
    int lastNumber, sum = 0, counter = 0;
    double avarage;

    Scanner scan = new Scanner(System.in);
    System.out.print("Bir sayı girin : ");
    lastNumber = scan.nextInt();
    for (int i = 0; i < lastNumber; i++) {
      if (i % 3 == 0 && i % 4 == 0) {
        counter++;
        sum += i;
      }
    }
    avarage = sum / counter;
    System.out.println("Ortalama : " + avarage);
    scan.close();
  }
}

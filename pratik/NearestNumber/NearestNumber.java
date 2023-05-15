package pratik.NearestNumber;

import java.util.Arrays;
import java.util.Scanner;

public class NearestNumber {

  public static void main(String[] args) {
    int[] list = { 56, 34, 1, 8, 101, -2, -33 };

    Scanner scan = new Scanner(System.in);
    System.out.println("Bir sayı girin : ");
    int number = scan.nextInt();
    scan.close();
    Arrays.sort(list);

    int max = list[0];
    int min = list[list.length - 1];

    for (int i : list) {
      if (i < min && i > number) {
        min = i;
      } else if (i > max && i < number) {
        max = i;
      }
    }

    System.out.println("Minimum yakın Değer " + min);
    System.out.println("Maximum yakın Değer " + max);
  }
}

package pratik.ArraySort;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Dizi eleman sayısı girin : ");
    int length = scanner.nextInt();

    int[] array = new int[length];
    for (int i = 0; i < array.length; i++) {
      System.out.printf("Dizinin %d. elemanını : ", i + 1);
      array[i] = scanner.nextInt();
    }
    Arrays.sort(array);
    System.out.println("Dizinin sıralı hali : " + Arrays.toString(array));
    scanner.close();
  }
}

package pratik.ArrayFrequency;

import java.util.Arrays;

public class ArrayFrequency {

  static boolean isFind(int[] arr, int value) {
    for (int i : arr) {
      if (i == value) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int[] array = { 10, 20, 20, 10, 10, 20, 5, 20 };
    int[] tempArray = new int[array.length];
    int counter = 0;
    System.out.println("Dizi : " + Arrays.toString(array));

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        if (array[i] == array[j]) {
          counter++;
        }
      }
      if (!isFind(tempArray, array[i])) {
        System.out.println(
          array[i] + " sayısı " + counter + " kere tekrar edildi."
        );
        tempArray[i] = array[i];
      }
      counter = 0;
    }
  }
}

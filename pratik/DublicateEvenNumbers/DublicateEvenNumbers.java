package pratik.DublicateEvenNumbers;

public class DublicateEvenNumbers {

  static boolean isFind(int[] arr, int value) {
    for (int i : arr) {
      if (i == value) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int[] numbers = { 2, 4, 4, 5, 13, 235, 12, 3, 4, 5, 12, 4 };
    int[] dublicate = new int[numbers.length];
    int startIndex = 0;

    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers.length; j++) {
        if ((i != j) && (numbers[i] == numbers[j])) {
          if (numbers[i] % 2 == 0) {
            if (!isFind(dublicate, numbers[j])) {
              dublicate[startIndex++] = numbers[i];
            }
          }
          break;
        }
      }
    }
    for (int value : dublicate) {
      if (value != 0) {
        System.out.println(value);
      }
    }
  }
}

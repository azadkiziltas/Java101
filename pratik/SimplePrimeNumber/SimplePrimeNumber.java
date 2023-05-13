package pratik.SimplePrimeNumber;

public class SimplePrimeNumber {

  public static void main(String[] args) {
    boolean bool = true;
    for (int i = 2; i <= 100; i++) {
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          bool = false;
        }
      }
      if (bool) {
        System.out.print(i + " ");
      }
      bool = true;
    }
  }
}

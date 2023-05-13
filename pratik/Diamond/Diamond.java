package pratik.Diamond;

public class Diamond {

  public static void main(String[] args) {
    int n = 4;
    for (int i = 3; i <= n; i++) {
      for (int j = 0; j < (n - i); j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= (2 * i + 1); k++) {
        System.out.print("*");
      }
      System.out.println(" ");
    }

    for (int i = n; i >= 0; i--) {
      for (int j = 0; j < (n - i); j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= (2 * i + 1); k++) {
        System.out.print("*");
      }
      System.out.println(" ");
    }
  }
}

package pratik.Harmonic;

import java.util.Scanner;

public class Harmonic {

  public static void main(String[] Args) {
    int number;
    double result = 0;
    Scanner scan = new Scanner(System.in);
    System.out.print("Harmonik serinin son sayısı : ");
    number = scan.nextInt();
    scan.close();
    for (int i = 1; i <= number; i++) {
      result += (1.0 / i);
    }
    System.out.println("Harmonik seri : " + result);
  }
}

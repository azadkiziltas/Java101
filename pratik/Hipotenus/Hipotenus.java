package pratik.Hipotenus;

import java.util.Scanner;

public class Hipotenus {

  public static void main(String[] args) {
    int a, b;
    double c, u, alan;
    Scanner scan = new Scanner(System.in);
    System.out.print("1. Kenar : ");
    a = scan.nextInt();
    System.out.print("2. Kenar : ");
    b = scan.nextInt();
    c = Math.sqrt((a * a) + (b * b));
    u = (a + b + c) / 2;
    alan = Math.sqrt(((u - a) * (u - b) * (u - c)));
    System.out.println("Hipotenus : " + c);
    System.out.print("Alan : " + alan);
    scan.close();
  }
}

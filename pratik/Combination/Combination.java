package pratik.Combination;

import java.util.Scanner;

public class Combination {

  public static void main(String[] args) {
    int n, r, c, nFactoriel = 1, nrFactoriel = 1, rFactoriel = 1;
    Scanner scan = new Scanner(System.in);
    System.out.print("n değerini girin : ");
    n = scan.nextInt();
    System.out.print("r değerini girin : ");
    r = scan.nextInt();

    for (int i = 1; i <= n; i++) {
      nFactoriel *= i;
    }
    for (int i = 1; i <= r; i++) {
      rFactoriel *= i;
    }
    for (int i = 1; i <= (n - r); i++) {
      nrFactoriel *= i;
    }

    c = nFactoriel / (rFactoriel * nrFactoriel);
    System.out.println("C(n,r) : " + c);
  }
}

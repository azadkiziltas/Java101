package pratik.KdvHesaplama;

import java.util.Scanner;

public class KdvHesaplama {

  public static void main(String[] args) {
    int kdv18 = 18, kdv8 = 8;
    float fiyat, kdvDahil = 0, kdv = 0;

    Scanner scan = new Scanner(System.in);
    System.out.print("Ürün fiyatını girin (kdv hariç) : ");
    fiyat = scan.nextFloat();
    if (fiyat <= 1000) {
      kdv = fiyat * kdv18 / 100;
      kdvDahil = fiyat + kdv;
    } else if (fiyat > 1000) {
      kdv = fiyat * kdv8 / 100;
      kdvDahil = fiyat + kdv;
    }
    System.out.println("Kdv : " + kdv);
    System.out.println("Kdv Dahil: " + kdvDahil);

    scan.close();
  }
}

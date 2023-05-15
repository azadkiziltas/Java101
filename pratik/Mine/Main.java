package pratik.Mine;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    int row, column;

    System.out.println("Mayın Tarlasına Hoşgeldiniz.");
    System.out.println("Lütfen oynamak istediğiniz boyutları giriniz: ");
    System.out.print("Satır sayısı: ");
    row = scan.nextInt();
    System.out.print("Sütun sayısı: ");
    column = scan.nextInt();

    Mine mine = new Mine(row, column);
    mine.run();
    scan.close();
  }
}

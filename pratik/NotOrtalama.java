package pratik;

import java.util.Scanner;

public class NotOrtalama {

  public static void main(String[] args) {
    int matematik, fizik, kimya, turkce, tarih, muzik;
    float ortalama;
    Scanner scan = new Scanner(System.in);
    System.out.print("Matemetik notunuz : ");
    matematik = scan.nextInt();
    System.out.print("Fizik notunuz : ");
    fizik = scan.nextInt();
    System.out.print("Kimya notunuz : ");
    kimya = scan.nextInt();
    System.out.print("Türkçe notunuz : ");
    turkce = scan.nextInt();
    System.out.print("Tarih notunuz : ");
    tarih = scan.nextInt();
    System.out.print("Müzik notunuz : ");
    muzik = scan.nextInt();
    ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;
    System.out.println("Ortalamanız : " + ortalama);
    scan.close();
  }
}

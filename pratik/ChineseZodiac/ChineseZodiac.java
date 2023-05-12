package pratik.ChineseZodiac;

import java.util.Scanner;

public class ChineseZodiac {

  public static void main(String[] args) {
    int year;
    Scanner scan = new Scanner(System.in);
    System.out.print("Doğum Yılınız: ");
    year = scan.nextInt();
    scan.close();

    String[] zodiacs = {
      "Maymun",
      "Horoz",
      "Köpek",
      "Domuz",
      "Fare",
      "Öküz",
      "Kaplan",
      "Tavşan",
      "Ejderha",
      "Yılan",
      "At",
      "Koyun",
    };

    System.out.printf("Çin Zodyağı Burcunuz : %s", zodiacs[year % 12]);
  }
}

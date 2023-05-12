package pratik.Advice;

import java.util.Scanner;

public class Advice {

  public static void main(String[] args) {
    int temperature;

    Scanner scan = new Scanner(System.in);
    System.out.print("Hava sıcaklığı : ");

    temperature = scan.nextInt();
    if (temperature >= 25) {
      System.out.println("Yüzmeye gidebilirsin");
    } else if (temperature >= 10) {
      System.out.println("Pikniğe gidebilirsin");
    } else if (temperature >= 5) {
      System.out.println("Sinemaya gidebilirsin");
    } else if (temperature >= 0) {
      System.out.println("Kayak Yapabilirsin");
    }
    scan.close();
  }
}

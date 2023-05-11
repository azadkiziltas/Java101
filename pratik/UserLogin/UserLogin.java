package pratik.UserLogin;

import java.util.Scanner;

public class UserLogin {

  public static void main(String[] args) {
    String username, password, newPassword, secim;

    Scanner scan = new Scanner(System.in);
    System.out.print("Kullanıcı adınızı giriniz : ");
    username = scan.nextLine();
    System.out.print("Şifrenizi girinizi : ");
    password = scan.nextLine();

    if (username.equals("admin") && password.equals("admin")) {
      System.out.print("Giriş başarılı.");
    } else {
      System.out.println("Kullanıcı adınız veya sıfreniz hatalı");
      System.out.println("Şifrenizi sıfırlamak ister misiniz?");
      System.out.println("(1) Evet");
      System.out.println("(2) Hayır");
      System.out.print("Seçim : ");

      secim = scan.nextLine();
      switch (secim) {
        case "1":
          System.out.print("Yeni şifre girinizi : ");
          newPassword = scan.nextLine();
          if (newPassword.equals("admin")) {
            System.out.print("Şifreniz bir önceki şifreniz ile aynı olamaz. ");
          } else {
            System.out.print("Şifreniz değiştirildi.");
          }
        case "2":
          System.out.print("Lütfen tekrar deneyin.");
      }
    }
    scan.close();
  }
}

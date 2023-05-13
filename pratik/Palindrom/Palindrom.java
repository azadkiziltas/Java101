package pratik.Palindrom;

public class Palindrom {

  static boolean isPalindrom(int number) {
    int temp = number, reserveNumber = 0, lastNumber;
    while (temp != 0) {
      lastNumber = temp % 10;
      reserveNumber = (reserveNumber * 10) + lastNumber;
      temp /= 10;
    }
    if (reserveNumber == number) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    System.out.println(isPalindrom(2122));
  }
}

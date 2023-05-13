package pratik.Obs;

public class Student {

  String name, stuNo;
  int classes;
  Course mat;
  Course fizik;
  Course kimya;
  double avarage;
  boolean isPass;

  Student(
    String name,
    int classes,
    String stuNo,
    Course mat,
    Course fizik,
    Course kimya
  ) {
    this.name = name;
    this.classes = classes;
    this.stuNo = stuNo;
    this.mat = mat;
    this.fizik = fizik;
    this.kimya = kimya;
    calcAvarage();
    this.isPass = false;
  }

  public void addBulkExamNote(
    int mat,
    int mat2,
    int fizik,
    int fizik2,
    int kimya,
    int kimya2
  ) {
    if (mat >= 0 && mat <= 100) {
      this.mat.note = mat;
      this.mat.note2 = mat2;
    }

    if (fizik >= 0 && fizik <= 100) {
      this.fizik.note = fizik;
      this.fizik.note2 = fizik2;
    }

    if (kimya >= 0 && kimya <= 100) {
      this.kimya.note = kimya;
      this.kimya.note2 = kimya2;
    }
  }

  public void isPass() {
    if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
      System.out.println("Notlar tam olarak girilmemiş");
    } else {
      this.isPass = isCheckPass();
      printNote();
      System.out.println("Ortalama : " + this.avarage);
      if (this.isPass) {
        System.out.println("Sınıfı Geçti. ");
      } else {
        System.out.println("Sınıfta Kaldı.");
      }
    }
  }

  public void calcAvarage() {
    this.avarage =
      (
        (this.fizik.note * 0.8 + this.fizik.note2 * 0.20) +
        (this.fizik.note * 0.8 + this.fizik.note2 * 0.20) +
        (this.fizik.note * 0.8 + this.fizik.note2 * 0.20)
      ) /
      3;
  }

  public boolean isCheckPass() {
    calcAvarage();
    return this.avarage > 55;
  }

  public void printNote() {
    System.out.println("=========================");
    System.out.println("Öğrenci : " + this.name);
    System.out.println("Matematik Notu : " + this.mat.note);
    System.out.println("Matematik Sözlü Notu : " + this.mat.note2);
    System.out.println("Fizik Notu : " + this.fizik.note);
    System.out.println("Fizik Sözlü Notu : " + this.fizik.note2);
    System.out.println("Kimya Notu : " + this.kimya.note);
    System.out.println("Kimya Sözlü Notu : " + this.kimya.note2);
  }
}

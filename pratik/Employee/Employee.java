package pratik.Employee;

public class Employee {

  String name;
  int salary;
  int workHours;
  int hireYear;

  public Employee(String name, int salary, int workHours, int hireYear) {
    this.name = name;
    this.salary = salary;
    this.workHours = workHours;
    this.hireYear = hireYear;
  }

  public double tax(int salary) {
    if (salary < 1000) {
      return 0;
    } else {
      return salary * 3 / 100;
    }
  }

  public double bonus(int workHours) {
    double bonus = 0;
    if (workHours > 40) {
      bonus = (workHours - 40) * 30;
    }
    return bonus;
  }

  public double raiseSalary(int hireYear) {
    double raiseSalary = 0;
    if (2021 - hireYear < 10) {
      raiseSalary = salary * 5 / 100;
    } else if ((2021 - hireYear) > 9 && (2021 - hireYear) < 20) {
      raiseSalary = salary * 10 / 100;
    } else {
      raiseSalary = salary * 15 / 100;
    }
    return raiseSalary;
  }

  public void toStringg() {
    System.out.println("Adı : " + this.name);
    System.out.println("Maaşı : " + this.salary);
    System.out.println("Çalışma Saati : " + this.workHours);
    System.out.println("Başlangıç Yılı : " + this.hireYear);
    System.out.println("Vergi : " + this.tax(salary));
    System.out.println("Bonus : " + this.bonus(workHours));
    System.out.println("Maaş Artışı : " + this.raiseSalary(hireYear));
    System.out.println(
      "Vergi ve Bonuslar ile birlikte maaş : " +
      (this.salary + this.bonus(workHours) - this.tax(salary))
    );
    System.out.println(
      "Toplam Maaş : " + (this.salary + this.raiseSalary(hireYear))
    );
  }
}

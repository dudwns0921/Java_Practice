package chapter4_9;

public class Company {
  public static void main(String args[]) {
    Employee employee, employee2;
    employee = new Sales(3000);
    employee2 = new Development(3400);

    employee.doJob();
    employee2.doJob();
  }
}

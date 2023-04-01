package chapter4_9;

public class Sales extends Employee {
  private static final String DEPT = "Sales";

  public Sales(int nInputSalary) {
    this.dept = Sales.DEPT;
    this.nSalary = nInputSalary;
  }

  @Override
  public void doJob() {
    System.out.println("Do Sales");

  }

}

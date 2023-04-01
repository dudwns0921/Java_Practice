package chapter4_9;

public class Development extends Employee {
  private static final String DEPT = "Development";

  public Development(int nInputSalary) {
    this.dept = Development.DEPT;
    this.nSalary = nInputSalary;
  }

  @Override
  public void doJob() {
    System.out.println("Do Development");
  }

}

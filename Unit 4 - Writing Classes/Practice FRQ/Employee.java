public class Employee {
  private String firstName;
  private String lastName;
  private String position;
  private double salary;

  public Employee(String name1, String name2, String pos, double pay) {
    firstName = name1;
    lastName = name2;
    position = pos;
    salary = pay;
  }

  public Employee(String name1, String name2) {
    firstName = name1;
    lastName = name2;
    position = "volunteer";
    salary = 0.0;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getPosition() {
    return position;
  }

  public double getSalary() {
    return salary;
  }

  public void setFirstName(String name1) {
    firstName = name1;
  }

  public void setLastName(String name2) {
    lastName = name2;
  }

  public void setPosition(String pos) {
    position = pos;
  }

  public String toString() {
    return "\n" + firstName + " " + lastName + "\n" + position + "\n$" + String.format("%.2f", salary) + "\n";
  }

  public void raise(double amount) {
    salary += amount;
  }

  public double dailyPay(int days) {
    return salary / days;
  }
}
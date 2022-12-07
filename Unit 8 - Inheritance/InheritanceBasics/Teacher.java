public class Teacher extends Person {
  private String department;

  public Teacher(String n, String d) {
    super(n);
    department = d;
  }

  public String getDep() {
    return department;
  }

  public String toString() {
    return getName() + " " + department;
  }
}
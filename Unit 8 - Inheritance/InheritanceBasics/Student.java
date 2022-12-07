public class Student extends Person {
  private int idNum;
  private double gpa;

  public Student(String n, int id, double g) {
    super(n); // Calling to parent's instructor
    idNum = id;
    gpa = g;
  }

  public int getID() {
    return idNum;
  }

  public double getGPA() {
    return gpa;
  }

  public boolean isEligible() {
    return gpa >= 2.5;
  }

  @Override
  public String toString() {
    return super.toString() + " " + idNum + " " + gpa;
  }
}

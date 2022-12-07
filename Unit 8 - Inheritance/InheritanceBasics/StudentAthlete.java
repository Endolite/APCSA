public class StudentAthlete extends Student {
  private String sport;

  public StudentAthlete(String n, int id, double g, String sp) {
    super(n, id, g);
    sport = sp;
  }

  @Override
  public boolean isEligible() {
    return getGPA() >= 3.0;
  }

  @Override
  public String toString() {
    return super.toString() + " " + sport;
  }
}
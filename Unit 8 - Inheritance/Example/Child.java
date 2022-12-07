public class Child extends Parent {
  private double a;

  public Child(int n1, String str1, double b) {
    super(n1, str1);
    a = b;
  }

  public int childMethod() {
    return 10;
  }
}
class Main {
  public static void main(String[] args) {
    Parent x = new Child(1, "a", 2.0);
    Child y = new Child(2, "b", 3.0);
    Child[] z = { (Child) x, y };
    for (Child c : z) {
      System.out.println(c.childMethod());
    }
    Parent[] w = { x, y };
    for (Parent p : w) {
      Child c = (Child) p;
      System.out.println(c.childMethod());
    }
    // int f = x.childMethod();
  }
}
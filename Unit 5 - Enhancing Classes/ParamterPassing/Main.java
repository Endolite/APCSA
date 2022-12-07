class Main {
  public static void main(String[] args) {
    ParameterTester tester = new ParameterTester();

    int a1 = 111;
    Num a2 = new Num(222);
    Num a3 = new Num(333);
    String a4 = "Hello";

    System.out.println("Before calling changeValues: ");
    System.out.println("a1\ta2\ta3\ta4");
    System.out.println(a1 + "\t" + a2 + "\t" + a3 + "\t" + a4 + "\n");

    tester.changeValues(a1, a2, a3, a4);

    System.out.println("After calling changeValues: ");
    System.out.println("a1\ta2\ta3\ta4");
    System.out.println(a1 + "\t" + a2 + "\t" + a3 + "\t" + a4 + "\n");

  }
}
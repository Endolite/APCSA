class Main {
  public static void main(String[] args) {
    int i = 1;
    while (i <= 5) {
      System.out.println(i);
      i++;
    }
    System.out.print("\n");
    // initialize; test condition; change;
    for (int n = 1; n <= 5; n++) {
      System.out.println(n);
    }
    System.out.println("\n");
    for (int x = 2; x <= 100; x += 2) {
      System.out.println(x);
    }
    System.out.println("\n");
    for (int y = 100; y >= 200; y -= 2) {
      System.out.println(y);
    }
  }
}
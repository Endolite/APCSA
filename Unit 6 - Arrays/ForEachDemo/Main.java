class Main {
  public static void main(String[] args) {
    int[] nums = { 2, 4, 6, 8, 10, 12, 14 };
    double[] temps = { 98.6, 99.2, 98.6, 100.2, 99, 1 };
    String[] names = { "Joey", "Chandler", "Phoebe", "Monica", "Ross", "Rachel" };

    for (String n : names) {
      System.out.println(n);
    }

    for (int n : nums) {
      if (n % 3 == 0) {
        System.out.println(n);
      }
    }

    for (double t : temps) {

    }
  }
}
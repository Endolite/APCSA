class Main {
  static int count = 0;

  public static int evenMatch(int[] a, int[] b) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 == 0 && b[i] % 2 == 0) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    int[] x = { 2, 3, 5 };
    int[] y = { 4, 8, 10 };
    System.out.println(evenMatch(x, y));
  }
}
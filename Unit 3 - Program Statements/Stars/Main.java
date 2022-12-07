class Main {
  public static void main(String[] args) {
    final int MAX_ROWS = 10;
    for (int row = 1; row <= MAX_ROWS; row++) {
      for (int star = 1; star <= row; star++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = 1; i < 11; i++) {
      for (int j = 1; j < 11; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
    int x = 5;
    int y = 5;
    if (x == 6) {
      System.out.println("Same");
    }
    if (x < y) {
      System.out.println("x less than y");
    } else {
      System.out.println("x greater than y");
    }
  }
}
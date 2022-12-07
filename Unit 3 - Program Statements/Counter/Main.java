public class Main {
  public static void main(String[] args) {
    int count = 0;
    while (count < 5) {
      System.out.println(count);
      count++; // count = count + 1;
    }
    System.out.println("f " + count);

    /*
     * less obvious infinite loop
     * int num = 1;
     * while (num != 10)
     * {
     * System.out.println(num);
     * num += 2;
     * }
     */
  }
}
class Main {
  public static void main(String[] args) {
    /*
     * First, relational operators
     * ==
     * !=
     * >
     * <
     * >=
     * <=
     */

    System.out.println(10 == 10);
    System.out.println(10 != 10);
    System.out.println(10 > 9);
    System.out.println(10 < 9);
    System.out.println(10 >= 10);
    System.out.println(10 <= 9);

    // basic if, else structure
    int rand = (int) (Math.random() * 10 + 1);
    if (rand == 7) {
      System.out.println("You got lucky number 7!");
    } else {
      System.out.println("You didn't get lucky number 7.");
      System.out.println("Your number was: " + rand);
    }

    // basic if, elif, ... else structure
    rand = (int) (Math.random() * 11);
    if (rand == 0) {
      System.out.println("The number is 0.");
    } else if (rand % 2 == 0) {
      System.out.println("The number is even.");
    } else {
      System.out.println("The number is odd.");
    }
  } // end of main
} // end of class
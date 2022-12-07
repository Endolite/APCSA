package castingNumbers;

// A. Patri
// 9/28/2020

public class Main {
  public static void main(String[] args) {
    System.out.println(1 / 3);
    System.out.println(1.0 / 3);
    System.out.println(1 / 3.0);
    System.out.println(1 / 3 + 4.4);
    System.out.println((double) 1 / 3);
    System.out.println(1 / (double) 3);
    System.out.println((double) (1 / 3));

    int biggest = Integer.MAX_VALUE;
    System.out.println(biggest);
    int smallest = Integer.MIN_VALUE;
    System.out.println(smallest);

    // WEIRD!
    System.out.println(biggest + 10);
    System.out.println(smallest - 100);

    // ALSO WEIRD
    System.out.println("The sum of 10 and 20 is: " + 10 + 20);
    System.out.println("The sum of 10 and 20 is: " + (10 + 20));

    // CAREFUL
    // int x = 20.0 / 10.0; NO NO
    int x = (int) (20.0 / 10.0);

    double y = 1 / 2;
    System.out.println(y);

    // FORMATTING
    double number = 1 / 3.0;
    System.out.println(number);
    System.out.println(String.format("%.02f", number));
    number = 2.999;
    System.out.println(String.format("%.02f", number));
  }
}

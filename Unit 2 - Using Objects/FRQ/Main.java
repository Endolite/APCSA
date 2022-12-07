package FRQ;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Name: ");
    String name = scan.nextLine();
    int d1 = (int) (Math.random() * 10);
    int d2 = (int) (Math.random() * 90) + 10;
    System.out.println(d1 + "-" + d2 + "-" + name.substring(0, 2));
  }
}

package runningStats;

// A. Patri
// 9/24/2020

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // instantiate and object of the Scanner class
    Scanner scan = new Scanner(System.in); // scan is our object
    System.out.println("\nRUNNING STATS\n"); // using new line character

    System.out.print("Enter your name: ");
    String name = scan.nextLine(); // nextLine is used for String input

    System.out.print("Enter your age: ");
    int age = scan.nextInt();

    System.out.print("Enter the number of miles you ran: ");
    double miles = scan.nextDouble();

    double kilometers = miles * 1.61;
    System.out.println(
        "\n" + name + ", who is " + age + " years old, ran " + miles + " miles or " + kilometers + " kilometers.");
  }
}
package testAverage;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // 1. Ask the user for 3 ints and call these grade1, grade2, grade3
    System.out.print("Grade 1: ");
    int grade1 = scan.nextInt();

    System.out.print("Grade 2: ");
    int grade2 = scan.nextInt();

    System.out.print("Grade 3: ");
    int grade3 = scan.nextInt();

    // 2. Declare an int variable called sum for the sum of the grades
    int sum;

    // 3. Declare a variable called average for the average of the grades
    double average;

    // 4. Write a formula to calculate the sum of the 3 grades (add them up).
    sum = grade1 + grade2 + grade3;

    // 5. Write a formula to calculate the average of the 3 grades from the sum
    // using division and type casting.
    average = (double) sum / 3;

    // 6. Print out the average using an informative message
    System.out.println("The average of these three grades is " + String.format("%.02f", average) + ".");
  }
}

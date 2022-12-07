package RandNums;

// Arnav P.
// 10/22/2020

import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Random rand1 = new Random();
    Random rand2;
    Random rand3 = null;

    int num;
    // Random int between lowest possible int and highest possible int
    num = rand1.nextInt();
    System.out.println(num);

    // Random int between 0 and 9
    num = rand1.nextInt(10); // 10 is the acual parameter
    System.out.println(num);

    // Random int between 1 and 10
    num = rand1.nextInt(10) + 1;
    System.out.println(num);

    // Random int between 20 and 34
    num = rand1.nextInt(15) + 20;
    System.out.println(num);

    // Random int between -10 and 9
    num = rand1.nextInt(20) - 10;
    System.out.println(num);

    double decNum = rand1.nextDouble();
    System.out.println(decNum);
  }
}

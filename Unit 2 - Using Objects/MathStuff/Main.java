package MathStuff;
// A. Patri

// 10/12/2020

public class Main {
  public static void main(String[] args) {
    // Math m1 = new Math(); NOT NECESSARY AND NOT ALLOWED

    // abs -- absolute value
    int posInt = Math.abs(-8);
    System.out.println(posInt);

    double posDouble = Math.abs(-9.1);
    System.out.println(posDouble);

    double result = Math.pow(8, 3);
    System.out.println(result);

    double sqRoot = Math.sqrt(45);
    System.out.println(sqRoot);

    System.out.println(Math.PI);
    System.out.println(Math.E);

    // random - return a double value greater than or equal to 0.0 and less than 1.0
    // (not inclusive)
    double randNum = Math.random();
    System.out.println(randNum);

    // (int) (Math.random() * range) + min
    // range = (max number - min number) + 1
    int range = 100 - 1 + 1;
    int secretNum = (int) (Math.random() * range) + 1;
    System.out.println(secretNum);

    int result2 = (int) (Math.random() * 6) + 5;
    System.out.println(result2);

    // generate and print a random number between 100 and 1000 (inclusive)
    int rand1 = (int) (Math.random() * 901) + 100;
    System.out.println(rand1);

    // generate and print a random number between -10 and 10 (inclusive)
    int rand2 = (int) (Math.random() * 21) - 10;
    System.out.println(rand2);

    // generate and print a random number between 0 and 9 (inclusive)
    int rand3 = (int) (Math.random() * 10);
    System.out.println(rand3);

  }
}
package calcThisAndThat;

public class Main {
    public static void main(String[] args) {
        // adding 1
        int total = 1;
        total = total + 1;
        System.out.println(total);
        System.out.println(total + 1);
        System.out.println(total);

        // Operators
        System.out.println(2 + 3);
        System.out.println(2 - 3);
        System.out.println(2 * 3);
        // System.out.println(2 ** 3); doesn't work in Java
        System.out.println(2 / 3);
        System.out.println(2.0 / 3);
        System.out.println(2.0 / 3.0);

        int sum = 3 + 5 + 7 + 7 + 1 + 3;
        System.out.println(sum);

        // Order of operations
        // *, /, % have precedence over + and -
        // UNLESS parentheses are used to group
        // L --> R

        System.out.println(2 + 3 * 6);
        System.out.println((2 + 3) * 6);

        // Modulo or Modulus or Mod Operator
        System.out.println(15 % 4);
        System.out.println(20 % 5);
        System.out.println(20 % 6);
        System.out.println(235543 % 2);
        System.out.println(235544 % 2);

    }
}

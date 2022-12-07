/*
 * I accidentally made it only including letters the first time, because I
 * didn't read the instructions
 * Encryption:
 * import java.util.Scanner;
 * class Main
 * {
 * public static void main(String[] args)
 * {
 * Scanner scan = new Scanner(System.in);
 * 
 * System.out.print("Plaintext: ");
 * String plain = scan.nextLine();
 * System.out.print("Shift: ");
 * int shift = scan.nextInt();
 * 
 * String cipher = "";
 * if (shift < 0)
 * {
 * shift = (Math.abs(shift) % 26) * -1;
 * }
 * if (shift > 26)
 * {
 * shift %= 26;
 * }
 * for (int i = 0; i < plain.length(); i++)
 * {
 * int x = (int) plain.charAt(i);
 * if (((x > 64) && (x < 91)) || ((x > 96) && (x < 123)))
 * {
 * x += shift;
 * if (x < 65)
 * {
 * x += 26;
 * }
 * else if (shift < -6)
 * {
 * if ((x > (96 + shift)) && (x < 97))
 * {
 * x += 26;
 * }
 * }
 * else if (shift > 6)
 * {
 * if ((x > 90) && (x < 91 + shift))
 * {
 * x -= 26;
 * }
 * }
 * else
 * {
 * if ((x > 90) && (x < 97))
 * {
 * if (shift < 0)
 * {
 * x += 26;
 * }
 * else
 * {
 * x -= 26;
 * }
 * }
 * }
 * if (x > 122)
 * {
 * x -= 26;
 * }
 * }
 * cipher += ((char) x);
 * }
 * System.out.print("Ciphertext: " + cipher);
 * }
 * }
 */
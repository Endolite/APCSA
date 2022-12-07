import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int i = 0;
    while (i < 1) {
      System.out.print("Plaintext: ");
      String plain = scan.nextLine();
      System.out.print("Shift: ");
      int shift = scan.nextInt();
      String cipher = "";
      if (shift < 0) {
        shift = (Math.abs(shift) % 94) * -1;
      }
      if (shift > 94) {
        shift %= 94;
      }

      for (int j = 0; j < plain.length(); j++) {
        int x = (int) plain.charAt(j);
        if (x != 32) {
          x += shift;
          if (x < 36) {
            x += 94;
          } else if (x > 126) {
            x -= 94;
          }
        }
        cipher += ((char) x);
      }
      System.out.println("Ciphertext: " + cipher);
      System.out.print("Encrypt More? ");
      scan.nextLine();
      String ans = scan.nextLine();
      if (ans.length() > 0)
        ;
      {
        int ans1 = (int) ans.charAt(0);
        if ((ans1 == 78) || (ans1 == 110)) {
          i++;
        }
      }
    }
  }
}

/*
 * Decryption:
 * import java.util.Scanner;
 * class Main
 * {
 * public static void main (String[] args)
 * {
 * Scanner scan = new Scanner(System.in);
 * int counter = 0;
 * int counter1 = 0;
 * System.out.print("Ciphertext: ");
 * String cipher = scan.nextLine();
 * while (counter1 < 1)
 * {
 * int count = 0;
 * int z = 0;
 * int max = 0;
 * int mostCommonLetter = 101;
 * if (counter == 1)
 * {
 * mostCommonLetter = 116;
 * }
 * else if (counter == 2)
 * {
 * mostCommonLetter = 97;
 * }
 * else if (counter == 3)
 * {
 * mostCommonLetter = 105;
 * }
 * else if (counter == 4)
 * {
 * mostCommonLetter = 111;
 * }
 * else if (counter == 5)
 * {
 * mostCommonLetter = 110;
 * }
 * else if (counter == 6)
 * {
 * mostCommonLetter = 115;
 * }
 * else if (counter > 6)
 * {
 * System.out.print("Most Common Letter: ");
 * String mostCommon = scan.nextLine();
 * mostCommon = mostCommon.toLowerCase();
 * mostCommonLetter = mostCommon.charAt(0);
 * }
 * for (int i = 33; i < 127; i++)
 * {
 * count = 0;
 * for (int x = 0; x < cipher.length(); x++)
 * {
 * if ((char) i == cipher.charAt(x))
 * {
 * count++;
 * }
 * }
 * if (count > max)
 * {
 * z = i;
 * max = count;
 * }
 * }
 * int shift = (z - mostCommonLetter) * -1;
 * 
 * String plain = "";
 * for (int j = 0; j < cipher.length(); j++)
 * {
 * int x = (int) cipher.charAt(j);
 * if (x != 32)
 * {
 * x += shift;
 * if (x < 36)
 * {
 * x += 94;
 * }
 * else if (x > 126)
 * {
 * x -= 94;
 * }
 * }
 * plain += ((char) x);
 * }
 * System.out.println("Most Common Letter: " + (char) mostCommonLetter +
 * "\t Shift: " + (shift * -1) + "\t Plaintext: " + plain);
 * counter++;
 * if (counter > 6)
 * {
 * System.out.print("Try another letter? ");
 * String ans = scan.nextLine();
 * char answer = ans.charAt(0);
 * if (((int) answer == 78) || ((int) answer == 110))
 * {
 * counter1++;
 * }
 * }
 * }
 * }
 * }
 */

/*
 * I accidentally made it only including letters the first time, because I
 * didn't read the instructions (I did it in a seperate repl, so I didn't have
 * access to them while writing it)
 * 
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
 * 
 * Decryption:
 * import java.util.Scanner;
 * class Main
 * {
 * public static void main(String[] args)
 * {
 * Scanner scan = new Scanner(System.in);
 * 
 * System.out.print("Ciphertext: ");
 * String cipher = scan.nextLine();
 * int count = 0;
 * int z = 0;
 * int max = 0;
 * for (int i = 65; i < 91; i++)
 * {
 * count = 0;
 * for (int x = 0; x < cipher.length(); x++)
 * {
 * if ((char) i == cipher.charAt(x))
 * {
 * count++;
 * }
 * if ((char) i + 32 == cipher.charAt(x))
 * {
 * count++;
 * }
 * }
 * if (count > max)
 * {
 * z = i;
 * max = count;
 * }
 * }
 * 
 * int shift = (z - 69) * -1;
 * int shift0;
 * if (shift > 1)
 * {
 * shift0 = 26 - shift;
 * }
 * else
 * {
 * shift0 = -26 - shift;
 * }
 * 
 * String plain = "";
 * if (shift < 0)
 * {
 * shift = (Math.abs(shift) % 26) * -1;
 * }
 * if (shift > 26)
 * {
 * shift %= 26;
 * }
 * for (int i = 0; i < cipher.length(); i++)
 * {
 * int x = (int) cipher.charAt(i);
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
 * plain += ((char) x);
 * }
 * System.out.println("Original Shift: " + shift0);
 * System.out.println("Plaintext: " + plain);
 * }
 * }
 */
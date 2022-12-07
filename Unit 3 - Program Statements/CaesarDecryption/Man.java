import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Ciphertext: ");
    String cipher = scan.nextLine();
    int count = 0;
    int z = 0;
    int max = 0;
    for (int i = 65; i < 91; i++) {
      count = 0;
      for (int x = 0; x < cipher.length(); x++) {
        if ((char) i == cipher.charAt(x)) {
          count++;
        }
        if ((char) i + 32 == cipher.charAt(x)) {
          count++;
        }
      }
      if (count > max) {
        z = i;
        max = count;
      }
    }

    int shift = (z - 69) * -1;
    int shift0;
    if (shift > 1) {
      shift0 = 26 - shift;
    } else {
      shift0 = -26 - shift;
    }

    String plain = "";
    if (shift < 0) {
      shift = (Math.abs(shift) % 26) * -1;
    }
    if (shift > 26) {
      shift %= 26;
    }
    for (int i = 0; i < cipher.length(); i++) {
      int x = (int) cipher.charAt(i);
      if (((x > 64) && (x < 91)) || ((x > 96) && (x < 123))) {
        x += shift;
        if (x < 65) {
          x += 26;
        } else if (shift < -6) {
          if ((x > (96 + shift)) && (x < 97)) {
            x += 26;
          }
        } else if (shift > 6) {
          if ((x > 90) && (x < 91 + shift)) {
            x -= 26;
          }
        } else {
          if ((x > 90) && (x < 97)) {
            if (shift < 0) {
              x += 26;
            } else {
              x -= 26;
            }
          }
        }
        if (x > 122) {
          x -= 26;
        }
      }
      plain += ((char) x);
    }
    System.out.println("Original Shift: " + shift0);
    System.out.println("Plaintext: " + plain);
  }
}
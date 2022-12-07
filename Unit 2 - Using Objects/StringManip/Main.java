// A. Patri
// 10/5/2020

class Main {
  public static void main(String[] args) {
    // String phrase = "Change is inevitable."; // a shortcut to create a new String
    String phrase = new String("Change is inevitable."); // long way to instantiate an object of the String class

    System.out.println("Original String: \"" + phrase + "\"");
    System.out.println("length of the string: " + phrase.length());

    System.out.println(phrase.toUpperCase());
    System.out.println(phrase.toLowerCase());

    System.out.println(phrase.replace('i', '*'));
    String phraseReplaced = phrase.replace('a', '#');
    System.out.println(phraseReplaced);

    // C h a n g e i s i n e v i t a b l e
    // 0 1 2 3 4 5 6 7 8 9 10 ...
    System.out.println(phrase.charAt(5));
    System.out.println(phrase.charAt(0)); // first character
    System.out.println(phrase.charAt(20)); // last character
    System.out.println(phrase.charAt(phrase.length() - 1)); // last character

    // first one I want, first one I don't want
    String partOfPhrase = phrase.substring(2, 10);
    System.out.println(partOfPhrase);

    // Weird things...
    System.out.println(phrase.substring(5));
    System.out.println(phrase.substring(5, phrase.length()));
    System.out.println(phrase.substring(5, 21));
    // System.out.println(phrase.substring(5, 22)); error

    int locOfFirstI = phrase.indexOf("i"); // first occurrence
    System.out.println(locOfFirstI);

    System.out.println(phrase.indexOf("inev")); // where it starts

    System.out.println(phrase.indexOf("x")); // -1
  }
}

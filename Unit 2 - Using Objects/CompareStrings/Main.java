// A. Patri
// 10/8/20

class Main {
  public static void main(String[] args) {
    // compareTo
    String s1 = "apple";
    String s2 = "zebra";
    int comp1 = s1.compareTo(s2);
    // s1 comes before s2 so comp1 is negative
    System.out.println(comp1);

    String s3 = "apple";
    String s4 = "apple";
    int comp2 = s3.compareTo(s4);
    // s3 is EXACTLY the same as s4 so comp2 is 0
    System.out.println(comp2);

    String s5 = "zebra";
    String s6 = "apple";
    int comp3 = s5.compareTo(s6);
    // s5 comes after s6 so comp3 is positive
    System.out.println(comp3);

    // equals method
    String password = "hungryhippo12";
    String attempt = "HungryHippo12";
    boolean result = password.equals(attempt);
    // result is false because password and attempt are not EXACTLY equal
    System.out.println(result);

    // equalsIgnoreCase method
    boolean result2 = password.equalsIgnoreCase(attempt);
    // result2 is true because password and attempt are the same if you ignore case
    System.out.println(result2);
  }
}
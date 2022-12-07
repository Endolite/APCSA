/*
In this problem, you'll design two classes for a clothing store. 

You'll write the classes for Clothing and TShirt.  TShirt is a child of the Clothing class. 

The Clothing class should have two instance variables: one for the size of the clothing (a String) and another for the clothing's color (a String). 

Clothing should have two accessor (getter) methods: 

getSize()

getColor() 

The TShirt class should have a private instance variable to store whether or not the tshirt has a pocket and a corresponding acessor (getter) method: 

hasPocket()

The constructors for the two classes should be in this format: 

public Clothing (String s, String c)

public TShirt (String s, String c, boolean hP)

Of course, both classes should have toString methods that return the pieces of information about the Clothing/TShirt. 

Complete the two classes below to meet the requirements.
*/
class Main {
  public static void main(String[] args) {
    Clothing a = new Clothing("small", "blue");
    Clothing b = new TShirt("large", "red", true);
    System.out.println(a + "\n" + b);
    System.out.println(a.getSize() + a.getColor() + ((TShirt) b).hasPocket());
  }
}
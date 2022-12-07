package storeThisAndThat;

public class Main {
    public static void main(String[] args) {
        // Three primitive data types
        // int -- whole numbers
        // declare age as an int
        // initialize it to 35
        int age = 35;
        int children; // declaration
        children = 2; // initialization

        // double -- decimal numbers
        double temperature = -3.6;
        double shoeSize = 7.5; // Camel case

        // boolean -- true/false
        boolean isOpen = false;
        boolean found = true;

        // Bonus primitive type
        // char -- single character
        char grade = 'A';
        char symbol = '$';

        // String -- NOT primitive data
        // A string is an object
        String name = "Kristin";
        String jerseyNumber = "7";

        System.out.println(shoeSize);

        // String concatenation
        System.out.println("Mrs. Franchi has " + children + " children.");

        String day = "Monday";
        int year = 2020;
        System.out.println("Oh boy, here is another " + day + " in " + year + ".");

        System.out.println("On a cold day in January it was " + temperature + " degrees.");
    }
}
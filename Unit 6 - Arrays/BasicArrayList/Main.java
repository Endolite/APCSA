import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    // ArrayList <type> name = new ArrayList <type> ();
    ArrayList<String> names = new ArrayList<String>();

    ArrayList<Integer> scores = new ArrayList<Integer>();
    // int size() returns the number of elements in the list
    System.out.println(names.size());
    System.out.println(scores.size());

    names.add("Ross");
    names.add("Rachel");
    names.add("Monica");
    names.add("Chandler");
    names.add("Phoebe");
    System.out.println(names);

    names.remove("Monica");
    names.remove(1);
    System.out.println(names);

    names.add(1, "Rachel");
    System.out.println(names);

    String castMember = names.get(3);
    System.out.println(castMember);

    String oldCastMember = names.set(2, "Mrs. Chanandler Bong");
    System.out.println(oldCastMember);
    System.out.println(names);

    for (int i = 0; i < names.size(); i++) {
      System.out.println(names.get(i));
    }

    for (String n : names) {
      System.out.println(n);
    }

    int i = 0;
    while (i < names.size()) {
      System.out.println(names.get(i));
      i++;
    }

    /*
     * ArrayLists can ONLY hold objects
     * Wrapper Class
     */
    int x = 6;
    Integer i1 = new Integer(x);
    Integer i2 = new Integer(7);
    Double d1 = new Double(1.5);
    // autoboxing
    Integer i3 = 6;
    // unboxing
    int y = i3;
  }
}
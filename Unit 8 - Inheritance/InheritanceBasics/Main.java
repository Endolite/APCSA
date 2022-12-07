class Main {
  public static void main(String[] args) {
    Person p = new Person("Jake Tapper");
    Teacher t = new Teacher("Kristin Franchi", "Math");
    Student s = new Student("Kishan Goli", 56789, 2.5);
    StudentAthlete sa = new StudentAthlete("Sanjay Gupta", 123456, 3.5, "Tennis");

    System.out.println(sa);

    Person[] theCrew = new Person[4];
    theCrew[0] = s;
    theCrew[1] = p;
    theCrew[2] = t;
    theCrew[3] = sa;
    for (Person c : theCrew) {
      System.out.println(c);
    }

  }
}
class Main {
  public static void main(String[] args) {
    Employee e1 = new Employee("Lebron", "James", "Basketball Player", 35600000);
    Employee e2 = new Employee("Mother", "Theresa");

    System.out
        .println(e1.getFirstName() + " " + e1.getLastName() + " makes $" + e1.dailyPay(82) + " per day he works.");

    System.out
        .println(e2.getFirstName() + " " + e2.getLastName() + " was a " + e2.getPosition() + " and so much more!");

    System.out.println(e1);
    System.out.println(e2);

    // Lebron donates half his salary to Mother Theresa (hypothetically)
    e2.raise(e1.getSalary() / 2.0);
    System.out.println("After a generous donation " + e2.getFirstName() + " " + e2.getLastName() + " now makes $"
        + e2.getSalary() + ".");

  }
}
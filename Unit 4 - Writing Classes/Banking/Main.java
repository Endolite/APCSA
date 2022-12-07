// Driver Class
class Main {
  public static void main(String[] args) {
    Account acct1 = new Account(10001, "Joey Tribbiani", 1245.12);
    Account acct2 = new Account(10002, "Phoebe Buffay", 1002.21);
    Account acct3 = new Account(10003, "Chandler Bing");

    System.out.println(acct3.getName() + "'s balance: " + acct3.getBalance());

    double acct1Balance = acct1.getBalance();
    System.out.println(acct1.getName() + "'s balance is $" + acct1Balance + ".");

    acct1.setName("Joseph Tribbiani");
    System.out.println("Updated Name: " + acct1.getName());

    acct1.deposit(510.51);
    double acct1UpdatedBal = acct1.withdraw(120.00, 3.00);
    System.out.println(acct1.getName() + "'s new balance is: $" + acct1UpdatedBal);
    acct3.addInterest();

    System.out.println(acct1.toString());
    System.out.println(acct2.toString());

    System.out.println(acct1);
    System.out.println(acct2);

    System.out.println(acct1.getName() + " has more money than " + acct2.getName() + ": " + acct1.hasMoreMoney(acct2));
  }
}
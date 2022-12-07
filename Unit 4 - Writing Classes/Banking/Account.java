/*
Account Class
Represent a bank account with basic services */
public class Account {
  private static final double INTEREST_RATE = 0.035;
  // instance data
  private int acctNum; // all instance data should be private
  private String name; // private to incapsulate (only accessible within the class via methods)
  private double balance; // private from other clients

  public Account(int account, String owner, double initial) {
    acctNum = account;
    name = owner;
    balance = initial;
  }

  public Account(int account, String owner) {
    acctNum = account;
    name = owner;
    balance = 0.0;
  }

  // accessor methods/getters
  public String getName() {
    return name;
  }

  public double getBalance() {
    return balance;
  }

  public int getAcctNum() {
    return acctNum;
  }

  // mutator method/setter
  public void setName(String newName) {
    name = newName;
  }

  // visibility modifier | return type | method name | (formal parameters)
  public double deposit(double amount) {
    if (amount < 0) {
      System.out.println("Error: deposit amount is invalid.");
      System.out.println(acctNum + "$" + amount);
    } else {
      balance += amount;
    }
    return balance;
  }

  public double withdraw(double amount, double fee) {
    if (amount < 0) {
      System.out.println("Error: withdrawal amount is invalid.");
      System.out.println("Account: " + acctNum);
      System.out.println("Request: $" + amount);
    } else {
      amount += fee;
      if (amount > balance) {
        System.out.println("Error: Insufficient Funds");
        System.out.println("Account: " + acctNum);
        System.out.println("Request: $" + amount);
        System.out.println("Available: $" + balance);
      } else
        balance -= amount;
    }
    return balance;
  }

  public double withdraw(double amount) {
    if (amount < 0) {
      System.out.println("Error: withdrawal amount is invalid.");
      System.out.println("Account: " + acctNum);
      System.out.println("Request: $" + amount);
    } else {
      if (amount > balance) {
        System.out.println("Error: Insufficient Funds");
        System.out.println("Account: " + acctNum);
        System.out.println("Request: $" + amount);
        System.out.println("Available: $" + balance);
      } else
        balance -= amount;
    }
    return balance;
  }

  public double addInterest() {
    balance += balance * INTEREST_RATE;
    return balance;
  }

  public String toString() {
    String str = acctNum + "\t" + name + "\t" + String.format("%.2f", balance);
    return str;
  }

  public boolean hasMoreMoney(Account a) {
    double balance1 = this.getBalance();
    double balance2 = a.getBalance();
    if (balance1 > balance2) {
      return true;
    } else {
      return false;
    }
  }
}
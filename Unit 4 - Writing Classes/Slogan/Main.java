class Main {
  public static void main(String[] args) {
    int num = Slogan.getNumOfSlogans();
    System.out.println(num);

    Slogan s1 = new Slogan("Just do it.");
    Slogan s2 = new Slogan("Where's the beef?");
    Slogan s3 = new Slogan("Think different.");

    System.out.println(s1.getSlogan());

    num = Slogan.getNumOfSlogans();
    System.out.println(num);
  }
}
public class Slogan {
  private String slogan;
  private static int numOfSlogans = 0;

  public Slogan(String slo) {
    slogan = slo;
    numOfSlogans++;
  }

  public String getSlogan() {
    return slogan;
  }

  // static methods can ONLY access/use static variables
  public static int getNumOfSlogans() {
    return numOfSlogans;
  }
}
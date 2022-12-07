public class Superhero {
  private String name;
  private String realName;
  private int originYear;
  private boolean canFly;

  public Superhero(String name1, String name2, int year, boolean fly) {
    name = name1;
    realName = name2;
    originYear = year;
    canFly = fly;
  }

  public Superhero(String name1, String name2, int year) {
    name = name1;
    realName = name2;
    originYear = year;
    canFly = false;
  }

  public void setCanFly(boolean fly) {
    canFly = fly;
  }

  public void setRealName(String name2) {
    realName = name2;
  }

  public int getOriginYear() {
    return originYear;
  }

  public String toString() {
    if (canFly == true) {
      return name + " (" + realName + ") became a superhero in the year " + originYear + " and is able to fly.";
    } else {
      return name + " (" + realName + ") became a superhero in the year " + originYear + " and is not able to fly.";
    }
  }

  public boolean isVeteran() {
    if (originYear <= 1980) {
      return true;
    } else {
      return false;
    }
  }

  public String changeName(String name1) {
    String old = name;
    name = name1;
    return old;
  }
}
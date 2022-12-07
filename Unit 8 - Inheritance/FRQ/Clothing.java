public class Clothing {
  private String size;
  private String color;

  public Clothing(String s, String c) {
    size = s;
    color = c;
  }

  public String getSize() {
    return size;
  }

  public String getColor() {
    return color;
  }

  public String toString() {
    return "Size: " + size + " Color: " + color;
  }
}
public class TShirt extends Clothing {
  private boolean hasP;

  public TShirt(String s, String c, boolean hP) {
    super(s, c);
    hasP = hP;
  }

  public boolean hasPocket() {
    return hasP;
  }

  public String toString() {
    return "Type: T-shirt " + super.toString() + " Has Pocket: " + hasP;
  }
}
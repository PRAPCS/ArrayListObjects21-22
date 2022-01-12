public class Cars {

  private String myColor;
  private int myMpg;

  public Cars(String c, int m) {
    myColor = c;
    myMpg = m;
  }

  public String getColor() {
    return myColor;
  }

  public void setColor(String nc) {
    myColor = nc;
  }

  public String toString() {
    return "Color: " + myColor + ", MPG: " + myMpg;
  }

}
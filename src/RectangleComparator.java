import java.util.Comparator;

public class RectangleComparator implements Comparator<Rectangle> {

  @Override
  public int compare(Rectangle a, Rectangle b) {
    int s1 = a.getLength() * a.getWidth();
    int s2 = b.getLength() * b.getWidth();
    return s1 - s2;
  }
}

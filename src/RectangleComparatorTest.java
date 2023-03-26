import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RectangleComparatorTest {

  private final RectangleComparator comparator = new RectangleComparator();

  @Test
  public void differentSquareComparison() {
    Rectangle first = new Rectangle(1, 2);
    Rectangle second = new Rectangle(2, 3);

    int result = comparator.compare(first, second);
    int result2 = comparator.compare(second, first);

    assertTrue(result < 0);
    assertTrue(result2 > 0);
  }

  @Test
  public void equalSquareComparisonSameLengthWidth() {
    Rectangle first = new Rectangle(1, 2);
    Rectangle second = new Rectangle(1, 2);

    int result = comparator.compare(first, second);
    int result2 = comparator.compare(second, first);

    assertEquals(result, result2);
    assertEquals(result2, result);
  }

  @Test
  public void equalSquareComparisonDifferentLengthWidth() {
    Rectangle first = new Rectangle(1, 2);
    Rectangle second = new Rectangle(2, 1);

    int result = comparator.compare(first, second);
    int result2 = comparator.compare(second, first);

    assertEquals(result, result2);
    assertEquals(result2, result);
  }

  @Test
  public void nullLengthRectanglesCompare() {
    Rectangle first = new Rectangle(0, 2);
    Rectangle second = new Rectangle(0, 1);

    int result = comparator.compare(first, second);
    int result2 = comparator.compare(second, first);

    assertEquals(0, result);
    assertEquals(0, result2);
  }

}

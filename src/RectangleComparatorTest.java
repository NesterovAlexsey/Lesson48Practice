import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

  @Test
  public void nullWidthRectanglesCompare() {
    Rectangle first = new Rectangle(1, 0);
    Rectangle second = new Rectangle(2, 0);

    int result = comparator.compare(first, second);
    int result2 = comparator.compare(second, first);

    assertEquals(0, result);
    assertEquals(0, result2);
  }

  @Test
  public void nullWidthLengthRectanglesCompare() {
    Rectangle first = new Rectangle(0, 0);
    Rectangle second = new Rectangle(0, 0);

    int result = comparator.compare(first, second);
    int result2 = comparator.compare(second, first);

    assertEquals(0, result);
    assertEquals(0, result2);
  }

  @Test
  public void extrimBigSquareComparison() {
    Rectangle first = new Rectangle(2, Integer.MAX_VALUE);
    Rectangle second = new Rectangle(2, 3);
    boolean flag = false;

    try {
      int result = comparator.compare(first, second);
    } catch (IllegalArgumentException e) {
      flag = true;
    }
    assertTrue(flag);
  }

  @Test
  public void sort() {
    Rectangle first = new Rectangle(1, 2);
    Rectangle second = new Rectangle(4, 5);
    Rectangle third = new Rectangle(6, 7);

    List<Rectangle> actual = new ArrayList<>();
    actual.add(first);
    actual.add(third);
    actual.add(second);

    List<Rectangle> expected = new ArrayList<>();
    expected.add(first);
    expected.add(second);
    expected.add(third);

    actual.sort(comparator);

    assertEquals(expected, actual);
  }
}

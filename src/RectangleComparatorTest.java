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
}

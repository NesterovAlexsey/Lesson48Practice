import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RectangleTest {

  @Test
  public void negativeWidthArgument(){
    boolean flag = false;

    try {
      Rectangle first = new Rectangle(-1, 2);
    } catch (IllegalArgumentException e) {
      flag = true;
    }
    assertTrue(flag);
  }

  @Test
  public void negativeLengthArgument(){
    boolean flag = false;

    try {
      Rectangle first = new Rectangle(1, -2);
    } catch (IllegalArgumentException e) {
      flag = true;
    }
    assertTrue(flag);
  }
}

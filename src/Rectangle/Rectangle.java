package Rectangle;//Задача 1
// Создать класс Rectangle.Rectangle (прямоугольник), которому в конструкторе нужно передавать длину и ширину.
// Написать компаратор, который сравнивает прямоугольники по площади.
// Написать тесты для этого компаратора.

public class Rectangle {

  private final int length;

  private final int width;

  public Rectangle(int length, int width) {
    if (length < 0) {
      throw new IllegalArgumentException("Length couldn't be negative");
    }
    this.length = length;
    if (width < 0) {
      throw new IllegalArgumentException("Width couldn't be negative");
    }
    this.width = width;
  }

  public int getLength() {
    return length;
  }

  public int getWidth() {
    return width;
  }

  @Override
  public String toString() {
    return String.format("Rectangle.Rectangle length = %d, width = %d, square = %d",
        length, width, length * width);
  }
}

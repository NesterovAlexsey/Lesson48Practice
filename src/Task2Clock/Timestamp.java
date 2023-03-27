//Создать класс Timestamp для хранения отметки времени (точки "часы:минуты").

//У класса должны быть методы "добавить часы" и "добавить минуты",
// принимающий количество часов (или минут) для добавления.
//
//В классе должен быть реализован интерфейс Comparable,
// который бы сравнивал отметки времени (раньше - меньше, позже - больше).
//
//Примечание: считаем, что корректные отметки времени находятся только в диапазоне от 00:00 до 23:59
//
//Попытка добавить 1 минуту к отметке 23:59 должна приводить к установке времени на отметку 00:00.
//
//Написать тесты.

package Task2Clock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Timestamp {

  private int hour;

  private int minute;

  public Timestamp(int hour, int minute) {
    this.hour = hour;
    this.minute = minute;
  }

  public int getHour() {
    return hour;
  }

  public int getMinute() {
    return minute;
  }

  public void setHour() throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

    int addHour = Integer.parseInt(read.readLine());
    while (addHour < 0) {
      System.out.println("Enter 0 or positive number of hours:");
      addHour = Integer.parseInt(read.readLine());
    }

    this.hour = getHour() + addHour;
  }
}

//Создать класс Timestamp для хранения отметки времени (точки "часы:минуты").

//У класса должны быть методы "добавить часы" и "добавить минуты",
// принимающий количество часов (или минут) для добавления.
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

public class Timestamp implements Comparable<Timestamp> {

  final static int MAXIMAL_HOURS = 24;
  final static int MAXIMAL_MINUTES = 60;
  private int hour;

  private int minute;

  public Timestamp(int hour, int minute) {
    if (hour > MAXIMAL_HOURS) {
      throw new IllegalArgumentException("Invalid value of hours");
    }
    this.hour = hour;
    if (minute > MAXIMAL_MINUTES) {
      throw new IllegalArgumentException("Invalid value of minutes");
    }
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

    System.out.print("add hour = ");
    int addHour = Integer.parseInt(read.readLine());
    while (addHour < 0) {
      System.out.println("Enter 0 or positive number of hours:");
      addHour = Integer.parseInt(read.readLine());
    }

    this.hour = hour + addHour;
  }

  public void setMinute() throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("add minutes = ");
    int addMinute = Integer.parseInt(read.readLine());
    while (addMinute < 0) {
      System.out.println("Enter 0 or positive number of minutes:");
      addMinute = Integer.parseInt(read.readLine());
    }

    this.minute = minute + addMinute;
  }

  @Override
  public String toString() {
    return hour + ":" + minute;
  }

  @Override
  public int compareTo(Timestamp other) {
    if (this.hour != other.getHour()) {
      return this.hour - other.getHour();
    }
    return this.minute - other.getMinute();
  }
}

package labs.ch02;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * класс Calendar с методами:
 * SetDate устанавливает дату
 * SetStartWeekday устанавливает первый день недели(вместо понедельника)\
 * toString
 */
public class Calendar {
    private static LocalDate d;
    private int year;
    private int month;
    private int day;
    private DayOfWeek startDay;

    public Calendar(int year, int month, int day) {
        this.year = year;
        this.day = day;
        this.month = month;
        startDay = DayOfWeek.MONDAY;
    }

    public void SetDate(int year, int month, int day) {
        this.year = year;
        this.day = day;
        this.month = month;

    }

    public void SetStartWeekday(DayOfWeek startDay) {
        this.startDay = startDay;
    }

    public String toString() {
        String res = "";
        for (int i = 0; i < 7; i++)
            res += startDay.plus(i).toString().toCharArray()[0] + "  ";
        res += "\n";
        d = LocalDate.of(year, month, day);
        while (d.getDayOfWeek() != startDay) {
            res += "   ";
            d = d.plusDays(-1);
        }  //res+=" ";
        d = LocalDate.of(year, month, day);
        while (d.getMonthValue() == month) {
            if (d.getDayOfWeek() == startDay)
                res += "\n";
            res += d.getDayOfMonth() + " ";
            if (d.getDayOfMonth() < 10)
                res += " ";
            d = d.plusDays(1);
        }
        res += "\n";
        return res;
    }

}

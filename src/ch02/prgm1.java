package ch02;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class prgm1 {
    static public void Calendar(int year,int month,int day){
        var d= LocalDate.of(year,month,day);
        while (d.getMonthValue()==1){
            if (d.getDayOfWeek()==         DayOfWeek.SATURDAY)
                System.out.println();
            System.out.print(d.getDayOfMonth());
            System.out.print(" ");
            if (d.getDayOfMonth()<10)
                System.out.print(" ");

            d=d.plusDays(1);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Calendar(2000,1,1);
    }
}

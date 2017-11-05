package assignment03;
import java.time.LocalDateTime;

public class CalendarTester{
    public static void main(String[] args){
        CalendarItem c1 = new CalendarItem(LocalDateTime.of(2017, 9, 21, 14, 20), LocalDateTime.of(2017, 9, 21, 15, 20),
                              "WRT111", "Lecture", "FA352", null);
        CalendarItem c2 = new CalendarItem(LocalDateTime.of(2017, 9, 21, 8, 05), LocalDateTime.of(2017, 9, 21, 9, 05),
                              "MATH224", "Lecture", "LN2403", c1);
        CalendarItem c3= new CalendarItem(LocalDateTime.of(2017, 9, 21, 10, 50), LocalDateTime.of(2017, 9, 21, 11, 50),
                              "CS140", "Lecture", "FA212", c2);
        CalendarItem c4 = new CalendarItem(LocalDateTime.of(2017, 9, 21, 12, 00), LocalDateTime.of(2017, 9, 21, 13, 00),
                              "CS120", "Lecture", "UU215", c3);
        
        

        CalendarList list1 = new CalendarList();
        list1.insertItem(c4);
        list1.setNext();
        list1.printCalendar();
        
        System.out.println(list1.getNext());
        
        
    }
}
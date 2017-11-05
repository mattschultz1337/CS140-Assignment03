package assignment03;
import java.time.LocalDateTime;
import java.util.Optional;

public class CalendarList {
    private CalendarItem first;
    private CalendarItem next;
    
    public void resetFirst(){
        this.setNext();
        first = next;
    }
    public CalendarItem getNext(){
        return next;
    }
    public void setNext(){
        CalendarItem nowItem = new CalendarItem();
        nowItem.setStart(LocalDateTime.now());
        nowItem.setEnd(LocalDateTime.now());
        CalendarItem temp = first;
        CalendarItem temphalf = first;
        CalendarItem temp2 = temp.getNextItem();
        while(temp.getNextItem()!=null){
            if(temp.isEqual(nowItem) || temp.getStart().isAfter(nowItem.getStart())){
                
                next = temp;
                temp = next.getNextItem();
                                    }
        
       
    }
    }
    public Optional<CalendarItem> findConflict(CalendarItem newItem){
        CalendarItem temp = first;
        while(temp.getNextItem() != null){
            if(temp.hasTimeConflictWith(newItem)){
                return Optional.of(temp);
            }
            temp = temp.getNextItem();
        }
        return Optional.empty();
    }
    private void insert(CalendarItem newItem){
        if(first==null){
            first=newItem;
            return;
        }
            CalendarItem temp = first;
            System.out.println(temp);
            while(temp != null){
                if(newItem.endsBefore(temp)){
                    newItem.setNextItem(temp);
                    temp.setNextItem(newItem);
                }
                    temp = temp.getNextItem();
                
            }
        }
    
    
    public void insertItem(CalendarItem newItem){
        if(first != null){
                    System.out.println("Progress setNext start");

            this.setNext();
                    System.out.println("Progress setNextDone");

            CalendarItem nowItem = new CalendarItem();
            nowItem.setStart(LocalDateTime.now());
            nowItem.setEnd(LocalDateTime.now());
            if(newItem.endsBefore(nowItem)){
                throw new IllegalArgumentException("It is too late for that appointment");
            }
            else if(nowItem.getStart().isBefore(newItem.getStart())){
                throw new IllegalArgumentException("That appointment is underway - run!");
            }
            Optional<CalendarItem> temp = findConflict(newItem);
            if(temp.isPresent()){
                throw new IllegalArgumentException ("You have a conflict, please use findconflict to find the conflicting appointment");
            }
        }
    insert(newItem);

    }
    public void printNext(){
        System.out.println(next);
    }
    public void printCalendar(){
        CalendarItem temp = first;
        while(temp != null){
            System.out.println(temp);
            temp = temp.getNextItem();
        }
    }
    
}

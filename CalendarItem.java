package assignment03;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CalendarItem{
    private LocalDateTime start;
    private LocalDateTime end;
    private String title;
    private String description;
    private String location;
    private CalendarItem nextItem;
    
    public CalendarItem(){
        
    }
    public CalendarItem(LocalDateTime s, LocalDateTime e, String t, String d, String l, CalendarItem n){
        start = s;
        end = e;
        title = t;
        description = d;
        location = l;
        nextItem = n;
    }
    public LocalDateTime getStart(){
        return start;
    }
    public LocalDateTime getEnd(){
        return end;
    }
    public String getTitle(){
        return title;
    }
    public String getDescription(){
        return description;
    }
    public String getLocation(){
        return location;
    }
    public CalendarItem getNextItem(){
        return nextItem;
    }   
    public void setStart(LocalDateTime s){
        if(end != null && s.isAfter(end))
	throw new IllegalArgumentException("the start cannot be after end");
        start = s;
    }
    public void setEnd(LocalDateTime e){
        if(start != null && start.isAfter(e)){
	       throw new IllegalArgumentException("the start cannot be after end");
        }
        end = e;
    }
    public void setTitle(String t ){
        title = t;
    }
    public void setDescription(String d){
        description = d;
    }
    public void setLocation(String l){
        location = l;
    }
    public void setNextItem(CalendarItem n){
        nextItem = n;
    }
    
    
    public static void main(String[] args) {
        CalendarItem test = new CalendarItem();
        test.setDescription("this is just a sample meeting of CS 140");
        test.setEnd(LocalDateTime.of(2017,9,11,11,50));
        test.setStart(LocalDateTime.of(2017,9,11,10,50));
        test.setTitle("CS 140");
        test.setLocation("FA 212");
        
        System.out.println(test);
        System.out.println();
        CalendarItem test2 = new CalendarItem();
        test2.setEnd(LocalDateTime.of(2017,9,11,13,30));
        test2.setStart(LocalDateTime.of(2017,9,11,11,30)); 
        System.out.println(test.hasTimeConflictWith(test2));
        System.out.println(test.noTimeConflictWith(test2));
        test2.setStart(LocalDateTime.of(2017,9,11,11,55));
        System.out.println(test.hasTimeConflictWith(test2));
        System.out.println(test.noTimeConflictWith(test2));
        }
    public String toString() {
	DateTimeFormatter dayForm =  DateTimeFormatter.ofPattern("MMMM d, yyyy");
	DateTimeFormatter timeForm =  DateTimeFormatter.ofPattern("h:m a");
	return start.format(dayForm) +" from " + start.format(timeForm) 
			+ " to " + end.format(timeForm) + "\n"
			+ title + " in " + location + "\n"
			+ description;
    }
    
    public boolean endsBefore(CalendarItem other){
        return end.isBefore(other.start);
    }
    public boolean startsAfter(CalendarItem other){
        return start.isAfter(other.end);
    }
    public boolean noTimeConflictWith(CalendarItem other) {
	   return endsBefore(other) || startsAfter(other);
    }	
    public boolean hasTimeConflictWith(CalendarItem other) {
        return !noTimeConflictWith(other);
    }   
    public boolean isEqual(CalendarItem other){
        return start.equals(other.getStart());
            
        
    }
    
}
import java.util.Calendar;  
public class CalendarAll{
  
  public static String returnTime(){
    Calendar cal = Calendar.getInstance();
    String dateTimeStr = cal.getTime().toString();
    return dateTimeStr;
  }
    
}
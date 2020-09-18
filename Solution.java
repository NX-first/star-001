import java.io.*;
import java.util.*;
import java.util.Date;
import java.text.*;
import java.math.*;
//import java.time.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        SimpleDateFormat fmt = new SimpleDateFormat("dd MM yyyy");
        
        Date d = fmt.parse(day+" "+month+" "+year);
        
        Calendar cal = Calendar.getInstance();
        
        cal.setTime(d);
        
        int weekDay = cal.get(Calendar.DAY_OF_WEEK);
        
        switch(weekDay) {
            case 1 : System.out.println("SUNDAY"); break;
            case 2 : System.out.println("MONDAY"); break;
            case 3 : System.out.println("TUESDAY"); break;
            case 4 : System.out.println("WEDNESDAY"); break;
            case 5 : System.out.println("THURSDAY"); break;
            case 6 : System.out.println("FRIDAY"); break;
            case 7 : System.out.println("SATURDAY"); break;
            default: break;
        }
    }
}
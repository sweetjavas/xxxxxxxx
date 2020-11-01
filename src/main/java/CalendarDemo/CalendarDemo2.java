package CalendarDemo;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo2 {
    public static void main(String[] args) {

        Date current = new Date();

        Calendar c= Calendar.getInstance();
        c.setTime(current);
        c.add(Calendar.DAY_OF_MONTH,1);
        c.set(Calendar.HOUR_OF_DAY,0);
        c.set(Calendar.MINUTE,0);
        c.set(Calendar.SECOND,0);

        Date endTime=c.getTime();
        c.add(Calendar.DAY_OF_MONTH,-7);
        Date BeginTime = c.getTime();

        System.out.println(BeginTime.toLocaleString());
        System.out.println(endTime.toLocaleString());
        //hireDate >=   begintime && hireDate <endTime

    }
}

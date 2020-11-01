package CalendarDemo;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println("年="+c.get(Calendar.YEAR));
        System.out.println("月="+(c.get(Calendar.MONTH)+1));
        System.out.println("日="+c.get(Calendar.DAY_OF_MONTH));
        System.out.println("时="+c.get(Calendar.HOUR_OF_DAY));
        System.out.println("分="+c.get(Calendar.MINUTE));
        System.out.println("秒="+c.get(Calendar.SECOND));
        System.out.println("-----------------------------");
        System.out.println("日="+c.get(Calendar.DAY_OF_MONTH));
        Date d =c.getTime();
        System.out.println(d);
        c.add(Calendar.DAY_OF_MONTH,100);
        System.out.println(c.getTime().toLocaleString());
        System.out.println(c.getTime().toString());



    }
}

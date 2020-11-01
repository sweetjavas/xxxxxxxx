package CalendarDemo;


import com.sun.deploy.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class DateUtil {
    public static final String DEFAULT_DATE_PATTERN ="yyyy-MM-dd HH:mm:ss";
    private DateUtil(){}
    public static void main(String[] args) {
        System.out.println(date2string(new Date(),"yyyy-MM-dd HH:mm:ss"));
        System.out.println(date2string(new Date(),"yyyy-MM-dd"));
        System.out.println(date2string(new Date()));
    }
    public static String date2string(Date date){
        return date2string(date,null);
    }
    public static String date2string(Date date, String pattern){
        SimpleDateFormat sdf = new SimpleDateFormat();
        if(BlankStringUtil.isBlank(pattern)){
            pattern = DEFAULT_DATE_PATTERN;
        }
        sdf.applyPattern(pattern);
        return sdf.format(date);

        }
    public static Date string2date(String date)throws Exception{
        return string2date(date,null);
    }
    public static Date string2date(String date,String pattern)throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat();

        if(BlankStringUtil.isBlank(pattern)){
            pattern = DEFAULT_DATE_PATTERN;
        }
        return sdf.parse(date);
    }


}

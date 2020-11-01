package SimpleDateFormatDemo;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        String pattern="yy-MM-dd HH:mm:ss E";
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern(pattern);
        String time = sdf.format(new java.util.Date());
        System.out.println(time);
        
        java.util.Date d = sdf.parse(time);
        System.out.println(d);


    }
}

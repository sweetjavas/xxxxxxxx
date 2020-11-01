package FileOutPutStream;

import java.io.*;

public class FileOutPutStreamDemo {
    public static void main(String[] args) throws IOException {
        String target = new String("stream.txt");
       OutputStream out=new FileOutputStream(target,true);
        out.write("ZXCVASDFQWER".getBytes());
        out.close();
    }

}

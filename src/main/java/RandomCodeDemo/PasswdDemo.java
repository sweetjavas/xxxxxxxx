package RandomCodeDemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

public class PasswdDemo {
    public static void main(String[] args) throws IOException {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        str +=str.toLowerCase();
        str +="0123456789";
        str +="~!@#$^%&%^&*()_+{}:?></.,][";

        System.out.println(str);

        StringBuilder sb = new StringBuilder();
        Random rd=new Random();
        for (int i=0;i<16;i++){
            char ch =str.charAt(new Random().nextInt(str.length()));
            sb.append(ch);
        }

        System.out.println(sb);
        String target = new String("stream1.txt");

        OutputStream out=new FileOutputStream(target+" ",true);
        out.write(sb.toString().getBytes());
        out.close();
    }
}

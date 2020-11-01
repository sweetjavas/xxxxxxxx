package RandomCodeDemo;

import java.util.Random;
import java.util.UUID;

public class RandomCodeDemo {
    public static void main(String[] args) {
        String code = UUID.randomUUID().toString().substring(0,5);
        System.out.println(code);

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        str +=str.toLowerCase();
        str +="0123456789";

        System.out.println(str);

        StringBuilder sb = new StringBuilder(5);
        Random rd=new Random();
        for (int i=0;i<5;i++){
            char ch =str.charAt(new Random().nextInt(str.length()));
            sb.append(ch);
        }
        System.out.println(sb);


    }
}

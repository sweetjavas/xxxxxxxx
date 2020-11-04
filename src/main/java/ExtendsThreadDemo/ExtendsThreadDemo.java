package ExtendsThreadDemo;
class MusicThread extends Thread{
    @Override
    public void run() {

        for (int i=0; i<50;i++){
            System.out.println("播放音乐"+i);
        }
    }
}
public class ExtendsThreadDemo {
    public static void main(String[] args) {

    }}

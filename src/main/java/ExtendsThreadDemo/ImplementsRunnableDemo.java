package ExtendsThreadDemo;
class MusicRunnableImplements implements Runnable{
    public void run(){
        for (int i=0;i<50;i++) {
            System.out.println("听音乐"+i);
    }
}}
public class ImplementsRunnableDemo {
    public static void main(String[] args) {
        for (int i=0;i<50;i++) {
            System.out.println("打游戏" + i);
            if(i==10) {
                Runnable target = new MusicRunnableImplements();
                Thread t = new Thread(target);
                t.start();}}}}



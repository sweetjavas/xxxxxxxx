package ExtendsThreadDemo;
class Apple implements Runnable {
    private int num = 50;



    @Override
    public void run() {
        for (int i = 1; i < 50; i++) {
            if (num > 0) {
                System.out.println(Thread.currentThread().getName() + "吃了编号为" + num-- + "的苹果");
            }
        }
    }


}


public class Implements_ThradDemo {
    public static void main(String[] args) {


    Apple a=new Apple();
        new Thread(a,"A").start();
        new Thread(a,"A").start();
        new Thread(a,"A").start();

}}

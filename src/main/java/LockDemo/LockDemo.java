package LockDemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Apple3 implements Runnable {
    private int num = 50;
    private final Lock lock = new ReentrantLock();


    @Override
    public void run() {
        for (int i = 1; i < 50; i++) {
        eat();
    }}
    private void eat(){
        //进入方法;立马枷锁
        lock.lock();
          if (num > 0) { try {
                System.out.println(Thread.currentThread().getName() + "吃了编号为" + num + "的苹果");

                    Thread.sleep(10);
                       num--;

                } catch (Exception e) {
                    e.printStackTrace();
                }finally {
              lock.unlock();  //开锁
          }
            }



    }

}
public class LockDemo {
    public static void main(String[] args) {
        Apple3 a=new Apple3();
        new Thread(a,"A").start();
        new Thread(a,"B").start();
        new Thread(a,"C").start();
    }
}

package snynchronized;

class Apple2 implements Runnable {
    private int num = 50;



    @Override
    public void run() {


            for (int i = 1; i < 50; i++) {
                synchronized (this) {
                    eat();
                }

            }}

    private void eat() {
        if (num > 0) {
            System.out.println(Thread.currentThread().getName() + "吃了编号为" + num + "的苹果");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            num--;

    }}}





public class synchronizedDemo {
    public static void main(String[] args) {
        Apple2 a = new Apple2();
        new Thread(a, "A").start();
        new Thread(a, "B").start();
        new Thread(a, "C").start();
    }
}

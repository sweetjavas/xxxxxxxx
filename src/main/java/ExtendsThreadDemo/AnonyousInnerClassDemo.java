package ExtendsThreadDemo;

public class AnonyousInnerClassDemo {



    public static void main(String[] args) {
    for (int i=0;i<50;i++) {
        System.out.println("打游戏" + i);
        if(i==10) {
            new Thread(){
                public  void run(){
                    for (int i=0;i<50;i++){
                        System.out.println("播放音乐"+i);}
                }
            }.start();
        }}}

            private static  void  test1(){for (int i=0;i<50;i++) {
                System.out.println("打游戏" + i);
                if(i==10) {

                    Thread t = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            {
                                for (int i=0;i<50;i++){
                                    System.out.println("播放电影"+i);
                                }
                            }
                        }
                    });
                    t.start();}




            }
}}

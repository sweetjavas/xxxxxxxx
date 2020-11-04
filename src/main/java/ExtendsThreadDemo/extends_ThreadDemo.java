package ExtendsThreadDemo;

class person extends  Thread{
    private int num=50;
    public person(String name){
        super(name);
    }

    public void rum(){
        for(int i=1;i<50;i++){
            if(num >0){
                System.out.println(super.getName()+"吃了编号为"+ num-- +"的苹果");
            }}}}
public class extends_ThreadDemo {
    public static void main(String[] args) {
        new person("A").start();
        new person("B").start();
        new person("C").start();

    }
}
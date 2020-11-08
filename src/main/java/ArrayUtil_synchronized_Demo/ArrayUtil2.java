package ArrayUtil_synchronized_Demo;

public class ArrayUtil2 {
    private ArrayUtil2(){}
    private static ArrayUtil2 instance=new ArrayUtil2();
    public  static  ArrayUtil2 getInstance(){
        return instance;
    }}
//单例 饿汉式


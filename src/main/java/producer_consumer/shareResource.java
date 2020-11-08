package producer_consumer;

public class shareResource {
    private String name;
    private String gender;
    public void push(String name,String gender){
        this.name=name;
        this.gender =gender;
    }
    //消费者从共享资源拿对象数据
    public void popup(){
        System.out.println(this.gender+"-"+this.name);
    }
}

package producer_consumer;

public class Producer implements Runnable{
    private shareResource resource = null;
    public Producer(shareResource resource){
        this.resource=resource;
    }
    public void  run(){
        for(int i=0;i<50;i++){
            if(i%2 ==0){
                resource.push("A","男");
            }else {
                resource.push("B","女");
            }
        }
    }
}
